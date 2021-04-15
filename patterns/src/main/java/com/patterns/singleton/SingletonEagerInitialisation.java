package com.patterns.singleton;

public class SingletonEagerInitialisation {

	private static final SingletonEagerInitialisation instance = new SingletonEagerInitialisation();
	private SingletonEagerInitialisation() {}
	
	public static SingletonEagerInitialisation getInstance() {
		return instance;
	}
}
