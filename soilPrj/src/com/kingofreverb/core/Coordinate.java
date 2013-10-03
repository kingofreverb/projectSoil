package com.kingofreverb.core;

/**
 * @duty to fix the coordinate with CSS
 * @since Soil 0.1
 */
final class Coordinate {
	
	private final int x;
	private final int y;
	private final int z;
	
	public Coordinate(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	int getX(){
		return this.x;
	}
	
	int getY(){
		return this.y;
	}
	
	int getZ(){
		return this.z;
	}
	
	@Override
	public String toString(){
		return this.x + "," + this.y + "," + this.z;
	}
	
}
