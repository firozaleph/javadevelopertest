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

class  CockdoodleSound implements SoundBehaviour
{


	public void sound() {
		System.out.println("Cock-a-doodle-doo");
		
	}
	
}

class  WoofWoofSound implements SoundBehaviour
{

	
	public void sound() {
		System.out.println("Woof, woof");
		
	}
	
}

class  MeowSound implements SoundBehaviour
{

	
	public void sound() {
		System.out.println("Meow");
		
	}
	
}

class CustomSound implements SoundBehaviour
{

	String sound;
	CustomSound(String sound)
	{
		this.sound=sound;
	}
	public void sound() {
		System.out.println(sound);
		
	}
	
}

