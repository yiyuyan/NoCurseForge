package cn.ksmcbrigade.ncf.mixin;

import net.minecraft.world.item.enchantment.VanishingCurseEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VanishingCurseEnchantment.class)
public class VanishingEnchantmentMixin {
    @Inject(method = "isCurse",at = @At("RETURN"),cancellable = true)
    public void Curse(CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(false);
    }
}
