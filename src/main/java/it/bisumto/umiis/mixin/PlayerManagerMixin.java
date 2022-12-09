package it.bisumto.umiis.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PlayerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PlayerManager.class)
public class PlayerManagerMixin {

    @Redirect(method = "loadPlayerData", at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/server/MinecraftServer;isHost(Lcom/mojang/authlib/GameProfile;)Z"
    ))
    private boolean isHost(MinecraftServer server, GameProfile profile) {
        return false;
    }

}
