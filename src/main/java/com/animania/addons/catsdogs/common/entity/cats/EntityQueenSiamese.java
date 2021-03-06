package com.animania.addons.catsdogs.common.entity.cats;

import net.minecraft.world.World;

public class EntityQueenSiamese extends EntityQueenBase {
	public EntityQueenSiamese(World worldIn)
	{
		super(worldIn);
		this.type = CatType.SIAMESE;
	}
	
	@Override
	public int getPrimaryEggColor()
	{
		return 0xBE9474;
	}
	
	@Override
	public int getSecondaryEggColor()
	{
		return 0x372A20;
	}
}
