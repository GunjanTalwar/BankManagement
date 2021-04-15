package com.patterns.factory;

public class DirectionsFactory {

	public static Directions getDirections(String direction) {
		
		switch (EnumDirections.valueOf(direction)) {
			case RIGHT:
				return new Right();
			case LEFT:
				return new Left();
			case FORWARD:
				return new Forward();
			case BACKWARD:
				return new Backward();
			default:
				return null;
		}
			
	}
}
