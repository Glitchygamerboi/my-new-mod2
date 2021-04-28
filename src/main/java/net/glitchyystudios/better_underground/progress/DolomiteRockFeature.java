package net.glitchyystudios.better_underground.progress;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

import java.util.Random;

public abstract class DolomiteRockFeature extends Feature {
    public DolomiteRockFeature(Codec configCodec) {
        super(configCodec);
    }

    public boolean generate(StructureWorldAccess world, ChunkGenerator generator, Random random, BlockPos pos, DefaultFeatureConfig config) {
        BlockPos topPos = world.getTopPosition(Heightmap.Type.WORLD_SURFACE, pos);
        Direction offset = Direction.NORTH;

        for (int y = 1; y <= 3; y++) {
            offset = offset.rotateYClockwise();
            world.setBlockState(topPos.down().offset(offset), Blocks.DEEPSLATE.getDefaultState(), 3);
        }
        return true;
    }
}
