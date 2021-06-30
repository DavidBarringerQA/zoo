package com.qa.zoo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class AnimalTest {

  Animal a;

  @Before
  public void init() {
    a = new Animal();
  }

  @Test
  public void eqaulity() {
    Animal b = new Animal();
    assertEquals(a, b);
    assertEquals(a.hashCode(), b.hashCode());
    b.setAge(30);
    assertFalse(a.equals(b));
    assertFalse(a.hashCode() == b.hashCode());
  }

  @Test
  public void getters() {
    assertEquals("", a.getName());
    assertEquals("", a.getSpecies());
    assertEquals(0, a.getAge());
    assertEquals(0, a.getLegs());
  }

  @Test
  public void setters() {
    a.setName("TestName");
    a.setSpecies("TestSpecies");
    a.setAge(2000);
    a.setLegs(3000);
    assertEquals("TestName", a.getName());
    assertEquals("TestSpecies", a.getSpecies());
    assertEquals(2000, a.getAge());
    assertEquals(3000, a.getLegs());
  }
}
