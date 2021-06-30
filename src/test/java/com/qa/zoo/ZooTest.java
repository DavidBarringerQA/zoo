package com.qa.zoo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ZooTest {

  Zoo zoo;

  @Before
  public void init() {
    zoo = new Zoo();
  }

  @Test
  public void add() {
    assertEquals(0, zoo.size());
    zoo.addAnimal(new Animal());
    assertEquals(1, zoo.size());
    zoo.addAnimal(new Animal());
    assertEquals(2, zoo.size());
  }

  @Test
  public void remove() {
    for (int i = 0; i < 10; i++) {
      zoo.addAnimal(new Animal());
    }
    assertEquals(10, zoo.size());
    zoo.removeAnimal(0);
    assertEquals(9, zoo.size());
  }

  @Test
  public void get() {
    for (int i = 0; i < 10; i++) {
      zoo.addAnimal(new Animal("", "", i, i));
    }
    assertEquals(new Animal("", "", 3, 3), zoo.getAnimal(3));
    assertEquals(new Animal("", "", 7, 7), zoo.getAnimal(7));
  }
}
