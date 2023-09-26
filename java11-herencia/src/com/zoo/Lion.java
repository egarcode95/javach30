package com.zoo;

public class Lion extends Feline {
	
	private int maneSize;

	public Lion(String name, int maneSize) {
		super(name, "savannah", 30, "beige");
		this.maneSize = maneSize;		
	}

	public int getManeSize() {
		return maneSize;
	}

	public void setManeSize(int maneSize) {
		this.maneSize = maneSize;
	}
	
	@Override
	public String eat(String food) {
		return "El león " + super.getName() + " come " + food;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append( super.toString()  );		
		builder.append("Lion [maneSize=");
		builder.append(maneSize);
		builder.append(", hasNightVision=");
		builder.append(hasNightVision());
		builder.append(", HairColor=");
		builder.append(getHairColor());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public String sleep() {		
		return "El León duerme bien rocolino marinela";
	}
	
	
	

}
