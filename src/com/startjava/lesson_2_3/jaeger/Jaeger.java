package com.startjava.lesson_2_3.jaeger;

public class Jaeger {
	
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	
	void setModelName(String modelName) {
		this.modelName = modelName;
	}

	void setMark(String mark) {
		this.mark = mark;
	}

	void setOrigin(String origin) {
		this.origin = origin;
	}

	void setHeight(float height) {
		this.height = height;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean drift() {
		System.out.println("You entered to drift");
		return true;
	}

	public void move() {
		System.out.println("You walked 5 steps");
	}

	public String scanKaiju() {
		return "nothing";
	}

	public void useVortexCannon() {
		System.out.println("I'm shooting to kill");
	}

	public String toString() {
		return "Model Name = '" + modelName + '\'' + 
		", Mark = '" + mark + '\'' + 
		", Origin = '" + origin + '\'' + 
		", Height = " + height + 
		", Weight = " + weight + ".";
	}
}