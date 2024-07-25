package com.pnku.mst.mixin;

import com.pnku.mst.block.MoreSmithingTableBlock;
import com.pnku.mst.init.MstBlockInit;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.SmithingMenu;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SmithingMenu.class)
public abstract class SmithingMenuMixin {

    @Inject(method = "isValidBlock", at = @At("HEAD"), cancellable = true)
    private void isValidBlock(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        if (state.getBlock() instanceof MoreSmithingTableBlock) {
            cir.setReturnValue(true);
        }
    }


}