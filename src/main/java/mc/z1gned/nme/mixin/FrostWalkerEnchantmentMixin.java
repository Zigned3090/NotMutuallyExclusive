package mc.z1gned.nme.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.FrostWalkerEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(FrostWalkerEnchantment.class)
public class FrostWalkerEnchantmentMixin {

    /**
     * @author
     * @reason
     */
    @Overwrite
    public boolean canAccept(Enchantment other) {
        return true;
    }

}
