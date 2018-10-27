package com.developer.java;

interface SoundBehaviour {
	
	void sound();
}

class QuackSound implements SoundBehaviour
{

	
	public void sound() {
		System.out.println("Quack, quack");
		
	}
	
}

class CluckSound implements SoundBehaviour
{

	
	public void sound() {
		System.out.println("Cluck, cluck");
		
	}
	
}

class CannotSound implements SoundBehaviour {


	public void sound() {
		System.out.println("Silenece");

	}

}
