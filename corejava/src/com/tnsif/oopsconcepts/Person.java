package com.tnsif.oopsconcepts;

public class Person {
	    private String name; // Private variable

	    // Setter method
	    public void setName(String newName) {
	        name = newName;
	    }

	    // Getter method
	    public String getName() {
	        return name;
	    }
	}

	 class EncapsulationExample {
	    public static void main(String[] args) {
	        Person p = new Person();
	        p.setName("John");
	        System.out.println("Name: " + p.getName()); // Output: Name: John
	    }
	}



