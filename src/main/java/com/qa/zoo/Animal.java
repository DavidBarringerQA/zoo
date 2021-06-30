package com.qa.zoo;

import java.util.Objects;

public class Animal {
  private String name;
  private String species;
  private int legs;
  private int age;

  public Animal() {
    this("", "", 0, 0);
  }

  public Animal(String name, String species, int legs, int age) {
    this.name = name;
    this.species = species;
    this.legs = legs;
    this.age = age;
  }

  public void speak() {
    System.out.println("Animal noise");
  }

  public String getName() {
    return this.name;
  }

  public String getSpecies() {
    return this.species;
  }

  public int getLegs() {
    return this.legs;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int hashCode() {
    return Objects.hash(name, species, age, legs);
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Animal animal = (Animal) obj;
    if (animal.getName() == null
        || animal.getSpecies() == null
        || this.name == null
        || this.species == null) {
      return false;
    }
    return (this.name.equals(animal.getName())
        && this.species.equals(animal.getSpecies())
        && this.age == animal.getAge()
        && this.legs == animal.getLegs());
  }
}
