package mc.z1gned.nme.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.PiercingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PiercingEnchantment.class)
public class PiercingEnchantmentMixin {

    /**
     * @author
     * @reason
     */
    @Overwrite
    public boolean canAccept(Enchantment other) {
        return true;
    }

}
