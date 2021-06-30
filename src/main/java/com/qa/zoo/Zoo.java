package com.qa.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

  private List<Animal> zoo;

  public Zoo() {
    zoo = new ArrayList<Animal>();
  }

  public int size() {
    return zoo.size();
  }

  public void addAnimal(Animal animal) {
    zoo.add(animal);
  }

  public void removeAnimal(int index) {
    zoo.remove(index);
  }

  public Animal getAnimal(int index) {
    return zoo.get(index);
  }
}
