package com.animania.addons.catsdogs.common.entity.cats;

import net.minecraft.world.World;

public class EntityKittenOcelot extends EntityKittenBase {
	public EntityKittenOcelot(World worldIn)
	{
		super(worldIn);
		this.type = CatType.OCELOT;
	}
	
	@Override
	public int getPrimaryEggColor()
	{
		return 0xB1834F;
	}
	
	@Override
	public int getSecondaryEggColor()
	{
		return 0x4C3822;
	}
}
