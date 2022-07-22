package mc.z1gned.nme.mixin;

import net.minecraft.enchantment.DepthStriderEnchantment;
import net.minecraft.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(DepthStriderEnchantment.class)
public class DepthStriderEnchantmentMixin {

    /**
     * @author
     * @reason
     */
    @Overwrite
    public boolean canAccept(Enchantment other) {
        return true;
    }

}
