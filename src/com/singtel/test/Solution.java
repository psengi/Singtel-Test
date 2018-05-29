package com.singtel.test;

class Neighbour {
	
	
}
class Animal {
	void walk(String name) {
		//
		switch (name) {
		case "":
			System.out.println("I am walking");
			Solution.COUNT_WALK++;
			break;

		default:
			System.out.println(name+" don’t walk.");
			break;
		}
	}
	
	void sing(String animalName, String neighbour){
		if(animalName == null) return;
		switch (animalName) {
		case "Dog":
			System.out.println("Woof, woof");
			Solution.COUNT_SING++;
			break;
		case "Cat":
			System.out.println("Meow");
			Solution.COUNT_SING++;
			break;
		default:
			
			break;
		}
	}
	
	
}

class Bird extends Animal {
	void fly(String birdName) {
		switch (birdName) {
		case "Chicken":
			System.out.println("A chicken cannot fly (assumption: its wings are clipped but ignore that)");
			
			break;
		case "Catterpillar":
			System.out.println("Caterpilar cannot fly.");
			break;	
		default:
			System.out.println(birdName+" am flying");
			Solution.COUNT_FLY++;
			break;
		}
		
	}
	
	void swim (String birdName){
		
		switch (birdName) {
		case "Duck":
			System.out.println("A duck can swim");
			Solution.COUNT_SWIM++;
			break;
		case "Fishes":
			System.out.println("Fishes can swim");
			Solution.COUNT_SWIM++;
			break;
		default:
			System.out.println(birdName+" can't swim.");
			break;
		}
	}
	
	void stayWith(String name, boolean isBird){
		if (isBird)
			sing(name, null);
		else
			super.sing(name, null);
	}
	
	public void sing(String birdName, String neighbour) {
		switch (birdName) {
		case "Duck":
			System.out.println("Quack, quack");
			Solution.COUNT_SING++;
			break;
		case "Chicken":
			System.out.println("Cluck, cluck");
			Solution.COUNT_SING++;
			break;
		case "Rooster":
			System.out.println("Cock-a-doodle-doo");
			Solution.COUNT_SING++;
			break;
		case "Parrot":
			stayWith(neighbour, false);
			
			break;
				
		default:
			System.out.println(birdName+" don't sing.");
			
			break;
		}
		
		
	}
	
	
	
	
	
}



class Fish extends Bird{
	
}

class Shark extends Fish {
	public Shark(){
		System.out.println("Sharks are large and grey");
		System.out.println("Sharks eat other fish");
	}
}

class ClownFish extends Fish {
	public ClownFish(){
		System.out.println("Clownfish are small and colourful (orange)");
		System.out.println("Clownfish make jokes");
	}
}

class Dolphin extends Animal {
	
	public Dolphin () {
		
		System.out.println();
	}
}

class Buttefly extends Bird {
	
}
class Caterpillar extends Bird {
	
}

public class Solution {
	
	public static int COUNT_SING;
	public static int COUNT_FLY;
	public static int COUNT_WALK;
	public static int COUNT_SWIM;
	public static void main(String[] args) {
		COUNT_SING = 0;
		COUNT_FLY = 0;
		COUNT_WALK = 0;
		COUNT_SWIM = 0;
		Bird bird = new Bird();
		bird.walk("");
		bird.fly("Duck");
		bird.sing("Duck", null);
		bird.sing("Chicken", null);
		bird.sing("Rooster", null);
		bird.sing("Parrot", "Dog");
		bird.sing("Parrot", "Cat");
		bird.sing("Parrot", "Rooster");
		
		Fish fish = new Fish();
		fish.sing("Fishes", null);
		fish.walk("Fishes");
		fish.swim("Fishes");
		new Shark();
		new ClownFish();
		Buttefly buttefly  = new Buttefly();
		buttefly.fly("Butterfly");
		buttefly.sing("Butterfly", null);
		
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.fly("Caterpillar");
		caterpillar.walk("");
		
		System.out.println("Animals can sing :"+COUNT_SING);
		System.out.println("Animals can fly :"+COUNT_FLY);
		System.out.println("Animals can swim :"+COUNT_SWIM);
		System.out.println("Animals can sing :"+COUNT_SING);
	}
	

}
