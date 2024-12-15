package net.danie.sproutlings.util;

import net.danie.sproutlings.Sproutlings;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Sproutlings.MOD_ID, name));
        }
    }

    public static class Items {

    }
}