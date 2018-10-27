package com.developer.java;

interface SingBehaviour {
	void sing();
}

class CanSing implements SingBehaviour
{


	public void sing() {
		System.out.println("I can Sing ");
		
	}

}

class CannotSing implements SingBehaviour
{


	public void sing() {
		System.out.println("I cannot Sing ");
		
	}
	
}