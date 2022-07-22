package mc.z1gned.nme.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.SilkTouchEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SilkTouchEnchantment.class)
public class SilkTouchEnchantmentMixin {

    /**
     * @author
     * @reason
     */
    @Overwrite
    public boolean canAccept(Enchantment other) {
        return true;
    }

}
