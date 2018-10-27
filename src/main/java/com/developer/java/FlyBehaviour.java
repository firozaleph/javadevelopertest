package com.developer.java;

interface FlyBehaviour {
	void fly();
}

class CanFly implements FlyBehaviour
{

	public void fly() {
		System.out.println("I am flying");
		
	}
	
}


class CannotFly implements FlyBehaviour
{

	public void fly() {
		System.out.println("I cannot fly");
		
	}
	
}