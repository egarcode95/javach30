package com.toy;

public class Tamagochi implements Pet {
	   private int lives;
	   private String name;

	   public Tamagochi(String name, int lives) {
	       this.name = name;
	       this.lives = lives;
	   }

	   public int getLives() {
	       return lives;
	   }

	   public void setLives(int lives) {
	       this.lives = lives;
	   }

	   public String getName() {
	       return name;
	   }

	   public void setName(String name) {
	       this.name = name;
	   }

	   @Override
	   public String trick() {
	       return "I'll die if you don't check me every hour";
	   }
	}
