package com.patterns.factory;

public class DirectionsFactoryClient {

	public static void main(String args[]) {
		Directions direction;
		
		//Generate instance of LEFT and print its corresponding LEFT state
		direction = DirectionsFactory.getDirections(EnumDirections.LEFT.toString());
		System.out.println(direction.getValue());
		
		//Generate instance of RIGHT and print its corresponding RIGHT state
		direction = DirectionsFactory.getDirections(EnumDirections.RIGHT.toString());
		System.out.println(direction.getValue());
		
		//Generate instance of FORWARD and print its corresponding FORWARD state
		direction = DirectionsFactory.getDirections(EnumDirections.FORWARD.toString());
		System.out.println(direction.getValue());
		
		//Generate instance of BACKWARD and print its corresponding BACKWARD state
		direction = DirectionsFactory.getDirections(EnumDirections.BACKWARD.toString());
		System.out.println(direction.getValue());
	}
}
