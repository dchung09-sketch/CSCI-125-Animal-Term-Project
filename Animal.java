/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Term Project
 */

package AnimalFiles;// This file belongs to the Animal File package

public class Animal {// Declearing a public class named Animal
    // instance variables
    private String name;// This is a private instance variable
    private final String species;// This is a private instance variable
    private final String sound;// This is a private instance variable
    private int age;// This is a private integer range number

    // Constructors
    public Animal() {// This ia a constructor for the Animal class
        this.name = "Cooper";// The name is being set to Cooper
        this.species = "Dog";// The species is being set to Dog
        this.sound = "Bark";// This sound is being set to Bark
        this.age = 8;// The age integer number is being set to 8
    }

    public Animal(String name, String species, String sound, int age) {// Setting a parameterized constructor
        this.name = name;// This variable is value of the parameter name
        this.species = species;// This variable is value of the parameter name
        this.sound = sound;// This variable is value of the parameter name
        this.age = age;// This variable is value of the parameter name
    }

    // get Methods
    public String getName() {// Set Name Value
        return this.name;// Returing the value of name
    }

    public String getSpecies() {// Set Species Value
        return this.sound;// Returning the value of sound
    }

    public int getAge() {// Set Age Value
        return this.age;// Returning the value of age
    }
    // Set Methods

    public void setName(String name) {// Set age Name
        this.name = name;// Return the value of name
    }

    public void setAge(int age) {// Defines a setter method
        this.age = age;// Return the value of name
    }

    public String toString() {// Overiding a string to create a custom String
        return "Name: " + this name + "\n" +// Constructs and returns a part of a string
                "Species: " + this.species + "\n" +// A method to display a series
                "Sound: " + this.sound + "\n" +// A method to display a sound
                "Age: " + this.age;// Returing the object in Strings, presenting the age

    }
}

