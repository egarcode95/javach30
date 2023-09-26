package com.zoo;

public abstract class Feline extends Mammals {
	
	private boolean nightVision;

	protected Feline(String name, String habitat, double lifespan, String hairColor) {
		super(name, habitat, lifespan, hairColor);
		this.nightVision = true;
	}

	protected boolean hasNightVision() {
		return nightVision;
	}

	protected void setNightVision(boolean nightVision) {
		this.nightVision = nightVision;
	}
	
	

}
