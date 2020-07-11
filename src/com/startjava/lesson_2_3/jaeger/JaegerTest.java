package com.startjava.lesson_2_3.jaeger;

public class JaegerTest {

	public static void main(String[] args) {
		// Jaeger = "Braser Phoenix"
		Jaeger bracerPhoenix = new Jaeger(); 
		bracerPhoenix.setModelName("Bracer Phoenix");
		bracerPhoenix.setMark("Mark-5");
		bracerPhoenix.setOrigin("USA");
		bracerPhoenix.setHeight(70.7f);
		bracerPhoenix.setWeight(2.1f);
		System.out.println(bracerPhoenix);
		bracerPhoenix.move();
		System.out.println("ScanKaiju " + bracerPhoenix.scanKaiju());
		// Jaeger = "Gipsy Avenger"
		Jaeger gipsyAvenger = new Jaeger();
		gipsyAvenger.setModelName("Gipsy Avenger");
		gipsyAvenger.setMark("Mark-6");
		gipsyAvenger.setOrigin("USA");
		gipsyAvenger.setHeight(81.77f);
		gipsyAvenger.setWeight(2.0f);
		System.out.println(gipsyAvenger);
		gipsyAvenger.drift();
		gipsyAvenger.useVortexCannon();
	}
}