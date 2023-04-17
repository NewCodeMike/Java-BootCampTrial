package com.coderscampus.objects;

public class Human {
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	// Visibility Modifier, return type, method name, params, scope
	String getInfo () {
		return "Gender: " + gender + ", Height: " + height + ", Weight: " + weight + ", Eye Color: " + eyeColor;
	}
}
