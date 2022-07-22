package mc.z1gned.nme.mixin;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(DamageEnchantment.class)
public class DamageEnchantmentMixin {

    /**
     * @author
     * @reason
     */
    @Overwrite
    public boolean canAccept(Enchantment other) {
        return true;
    }

}
