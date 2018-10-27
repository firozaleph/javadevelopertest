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
	Chicken(SoundBehaviour soundBehaviour)
	{
		super();
		this.flyBehaviour=new CannotFly();
		this.soundBehaviour=soundBehaviour;
		
	}
	
	void doSound()
	{
		soundBehaviour.sound();
	}


}

class Rooster extends Animal{
	
	Chicken chicken;
	
	Rooster()
	{
		chicken=new Chicken(new CockdoodleSound());
		
	}
	
	void doSound()
	{
		chicken.doSound();
	}
}


class Parrot extends Bird {
	
	SoundBehaviour soundBhevaiour;
	
	Parrot()
	{
		
	}
	
	
	Parrot(SoundBehaviour soundBhevaiour)
	{
		this.soundBhevaiour=soundBhevaiour;
	}
	
	void doSound()
	{
		soundBhevaiour.sound();
	}
}

class Fish extends Animal
{

	Fish()
	{
		this.walkBehaviour=new CannotWalk();
		this.singBehaviour=new CannotSing();
		this.swimBehaviour=new CanSwim();
		
	}
	
	void doWalk()
	{
		walkBehaviour.walk();
	}
	void doSing()
	{
		singBehaviour.sing();
	}
	void doSwim()
	{
		swimBehaviour.swim();
	}
	
	
}

class Shark extends Fish 
{
	
	void display()
	{
		System.out.println(" large and grey");
	}
	 
	void joke(){
		System.out.println("I cam make Joke");
	}
}

class Clownfish extends Fish 
{
	
	void display()
	{
		System.out.println(" small and colourful (orange)");
	}
	
	void eat()
	{
		System.out.println("I eat other fishes");
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
