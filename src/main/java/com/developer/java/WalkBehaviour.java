package com.developer.java;

interface WalkBehaviour {
	void walk();
}


class CanWalk implements WalkBehaviour
{


	public void walk() {
		System.out.println("I am walking");
		
	}
	
}


class CannotWalk implements WalkBehaviour
{


	public void walk() {
		System.out.println("I cannot walk");
		
	}
	
}