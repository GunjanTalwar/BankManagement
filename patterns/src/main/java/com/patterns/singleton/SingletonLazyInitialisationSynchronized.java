package com.patterns.singleton;

public class SingletonLazyInitialisationSynchronized {

	private static SingletonLazyInitialisationSynchronized instance;
	private SingletonLazyInitialisationSynchronized() {}
	
	public SingletonLazyInitialisationSynchronized getInstance() {
		
		if(instance == null) {
			synchronized(SingletonLazyInitialisationSynchronized.class) {
				if(instance == null) {
					instance = new SingletonLazyInitialisationSynchronized();
				}
			}
		}
		return instance;
	}
}
