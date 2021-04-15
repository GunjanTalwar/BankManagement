package com.patterns.singleton;

public class SingletonLazyInitialisation {

	private static SingletonLazyInitialisation instance;
	
	private SingletonLazyInitialisation() {}
	
	public static SingletonLazyInitialisation getInstance() {
		
		if(instance == null) {
			instance = new SingletonLazyInitialisation();
		}
		return instance;
	}
}
