package com.developer.java;

import java.util.HashMap;
import java.util.Map;

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
	String country;
	
	
	Rooster()
	{
		chicken=new Chicken(new CockdoodleSound());
		
	}
	Rooster(String country)
	{
		Map<String,String> secondLanguage=new HashMap<String, String>();
		secondLanguage.put("Danish","kykyliky");
		secondLanguage.put("Dutch","kukeleku");
		secondLanguage.put("French","cocorico");
		secondLanguage.put("Finnish","kukko kiekuu");
		secondLanguage.put("German","kikeriki");
		secondLanguage.put("Greek","kikiriki");
		secondLanguage.put("Hebrew","coo-koo-ri-koo");
		secondLanguage.put("Hungarian","kukuriku");
		secondLanguage.put("Italian","chicchirichi");
		secondLanguage.put("Japanese","ko-ke-kok-ko-o");
		secondLanguage.put("Portuguese","cucurucu");
		secondLanguage.put("Russian","kukareku");
		secondLanguage.put("Swedish","kuckeliku");
		secondLanguage.put("Turkish","kuk-kurri-kuuu");
		secondLanguage.put("Urdu","kuklooku");
		chicken=new Chicken(new CustomSound(secondLanguage.get(country)));
		
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

class Dolhpin extends Animal
{
	Fish fish=new Fish();
	Dolhpin()
	{
		super.swimBehaviour=fish.swimBehaviour;
	
	}
	
}

class Butterfly extends Bird
{
	Butterfly()
	{
		super(new CanFly(), new CannotSing());
	}
	
	void toCaterPillar()
	{
		this.singBehaviour=new CannotSing();
		this.flyBehaviour=new CannotFly();
	}
}

class Frog extends Animal
{
	
}
class Dog extends Animal
{
	
}
class Cat extends Animal
{
	
}

public class Solution {
	public static void main(String[] args) {
		/*Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();*/
		
		Animal[] animals = new Animal[]{ new Bird(),
		        new Duck(),
		        new Chicken(),
		        new Rooster(),
		        new Parrot(),
		        new Fish(),
		        new Shark(),
		        new Clownfish(),
		        new Dolhpin(),
		        new Frog(),
		        new Dog(),
		        new Butterfly(),
		        new Cat()
		};
		
		int fly=0,walk=0,sing=0,swim=0;
		for(Animal animal:animals)
		{
			if(animal.walkBehaviour instanceof CanWalk)
				walk=walk+1;
			
			if(animal.flyBehaviour instanceof CanFly)
				fly=fly+1;
			
			if(animal.singBehaviour instanceof CanSing)
				sing=sing+1;
			
			if(animal.swimBehaviour instanceof CanSwim)
				swim=swim+1;
		}
		
		System.out.println("how many of these animals can fly? "+fly);
		System.out.println("how many of these animals can walk? "+walk);
		System.out.println("how many of these animals can sing? "+sing);
		System.out.println("how many of these animals can swim? "+swim);
	}
}
