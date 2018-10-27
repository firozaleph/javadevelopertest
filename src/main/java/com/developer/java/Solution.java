package com.developer.java;

class Animal {
	
	WalkBehaviour walkBehaviour;
	FlyBehaviour flyBehaviour;
	SingBehaviour singBehaviour;
	SoundBehaviour soundBehaviour;
	SwimBehaviour swimBehaviour;
	
	Animal()
	{
		this.walkBehaviour=new CanWalk();
		this.singBehaviour=new CannotSing();;
		this.flyBehaviour=new CannotFly();
		this.soundBehaviour=new CannotSound();
		this.swimBehaviour=new CannotSwim();

	}
	
	Animal(WalkBehaviour walkBehaviour)
	{
		this.walkBehaviour=walkBehaviour;
	}
	
    void walk(){
    	walkBehaviour.walk();
    	}
}

class Bird extends Animal {
	Bird()
	{
		super.flyBehaviour=new CanFly();
		super.singBehaviour=new CanSing();
	}
	Bird(FlyBehaviour flyBehaviour,SingBehaviour singBehaviour)
	{
		super.flyBehaviour=flyBehaviour;
		super.singBehaviour=singBehaviour;
	}
	
	void fly()
	{
		flyBehaviour.fly();
		
	}
	
	void sing()
	{
		singBehaviour.sing();
	}
}

class Duck extends Bird {
	
	
	Duck()
	{
		super();
		super.swimBehaviour=new CanSwim();
		super.soundBehaviour=new QuackSound();
		
		
	}

	void doSound()
	{
		soundBehaviour.sound();
	}


}

class Chicken extends Bird  {
	

	Chicken()
	{
		super();
		this.flyBehaviour=new CannotFly();
		this.soundBehaviour=new CluckSound();
		
	}

	
	void doSound()
	{
		soundBehaviour.sound();
	}


}



public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
