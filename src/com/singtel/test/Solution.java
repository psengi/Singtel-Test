package com.singtel.test;

class Neighbour {
	
	
}
class Animal {
	void walk() {
		System.out.println("I am walking");
	}
	
	void sing(String animalName, String neighbour){
		if(animalName == null) return;
		switch (animalName) {
		case "Dog":
			System.out.println("Woof, woof");
			
			break;
		case "Cat":
			System.out.println("Meow");
			
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

		default:
			System.out.println("I am flying");
			break;
		}
		
	}
	
	void swim (String birdName){
		
		switch (birdName) {
		case "Duck":
			System.out.println("A duck can swim");
			
			break;

		default:
			break;
		}
	}
	
	void stayWith(String name){
		sing(name, null);
	}
	
	public void sing(String birdName, String neighbour) {
		super.sing(birdName, neighbour);
		switch (birdName) {
		case "Duck":
			System.out.println("Quack, quack");
			
			break;
		case "Chicken":
			System.out.println("Cluck, cluck");
			
			break;
		case "Rooster":
			System.out.println("Cock-a-doodle-doo");
			
			break;
		case "Parrot":
			stayWith(neighbour);
			
			break;
		
		default:
			break;
		}
		
		
	}
	
	class Parrot extends Bird {
		
	}
	
	
}

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly("Duck");
		bird.sing("Duck", null);
		bird.sing("Chicken", null);
		bird.sing("Rooster", null);
		bird.sing("Parrot", "Dog");
		bird.sing("Parrot", "Cat");
		bird.sing("Parrot", "Rooster");
	}
}
