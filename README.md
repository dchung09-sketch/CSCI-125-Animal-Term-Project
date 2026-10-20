# Animal Term Project

**Author:** Daniel Chung  
**Course:** CSCI 125 – Programming I  
**Section:** M01  
**Institution:** New York Institute of Technology  
**Language:** Java

## Overview

This project defines an Animal class that represents an animal using its name, species, sound, and age. It demonstrates foundational object-oriented programming concepts, including constructors, encapsulation, getters, setters, and a custom toString() method.

## Features

- Create an animal using default values or custom information.
- Store animal properties using private instance variables.
- Retrieve information through getter methods.
- Update the animal’s name and age through setter methods.
- Display animal information using the toString() method.
- Keep species and sound fixed after construction using final fields.

## Default Values

The default constructor creates an animal with these properties:

| Property | Value |
|----------|-------|
| Name | Cooper |
| Species | Dog |
| Sound | Bark |
| Age | 8 |

The parameterized constructor allows custom values for all four properties.

## File Information

- **Animal.java:** Defines the Animal class.
- **Package:** AnimalFiles

This class does not contain a main() method. A separate driver class is needed to create Animal objects and run a demonstration.

## Programming Concepts Demonstrated

- Classes and objects
- Private instance variables
- Encapsulation
- Default and parameterized constructors
- Getter and setter methods
- The this keyword
- The final keyword
- Overriding toString()
- String concatenation

## Current Code Notes

The uploaded source requires two corrections:

1. In toString(), change `this name` to `this.name` to fix a compilation error.
2. In getSpecies(), change `return this.sound;` to `return this.species;` so the method returns the correct property.

## How to Use

1. Install a Java Development Kit (JDK).
2. Place Animal.java in a folder named AnimalFiles to match its package.
3. Apply the corrections listed above.
4. Create a separate driver class with a main() method.
5. Import AnimalFiles.Animal in the driver.
6. Create Animal objects using either constructor.
7. Use the getter and setter methods to access or update information.
8. Print an Animal object to display its details.

## Learning Objective

Practice designing a Java class that groups related data and methods into an object while controlling access to its fields through encapsulation.
