
package com.example.inheritance;

import com.example.Encapsulation.Animal;
public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Encapsulation: Getter method for private property
    public String getBreed() {
        return breed;
    }
}
