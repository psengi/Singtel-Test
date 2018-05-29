package com.singtel.test;

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}

	public void sing(String birdName) {
		switch (birdName) {
		case "Duck":
			System.out.println("A duck says: “Quack, quack”");
			System.out.println("A duck can swim");
			
			break;
		case "Chicken":
			System.out.println("A chicken says: “Cluck, cluck”");
			System.out.println("A chicken cannot fly (assumption: its wings are clipped but ignore that)");
			
			break;
		case "Rooster":
			System.out.println("A rooster says: “Cock-a-doodle-doo”");
			
			break;
		default:
			break;
		}
	}
}

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing("Duck");
		bird.sing("Chicken");
		bird.sing("Rooster");
	}
}
