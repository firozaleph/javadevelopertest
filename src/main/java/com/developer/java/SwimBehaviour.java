package com.developer.java;

interface SwimBehaviour {
	
	void swim();
}

class CanSwim implements SwimBehaviour{

	
	public void swim() {
		System.out.println("I Can Swim");
		
	}
	
}
class CannotSwim implements SwimBehaviour{
	
	
	public void swim() {
		System.out.println("I Cannot Swim");
		
	}
}

