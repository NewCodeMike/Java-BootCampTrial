package com.coderscampus.objects;

public class RunnableClass {

	public static void main(String[] args) {
		// Class -> Blueprint form an Object
		// Object -> Noun, it's an instantiation of a Class
		
		// Data type, Variable name, assignment operation
		// int someNumber = 39;
		
		Human trevorPage = new Human();
		
		trevorPage.eyeColor = "brown";
		trevorPage.gender = "male";
		trevorPage.height = "5'10\"";
		trevorPage.weight = "160";
		
		System.out.println(trevorPage.getInfo());
		
		Human elonMusk = new Human();
		
		elonMusk.eyeColor = "blue";
		elonMusk.gender = "male";
		elonMusk.height = "6'1\"";
		elonMusk.weight = "190";
		
		System.out.println(elonMusk.getInfo());
		
		Human christinaPage = new Human();
		
		christinaPage.eyeColor = "brown";
		christinaPage.gender = "female";
		christinaPage.height = "5'5\"";
		christinaPage.weight = "130";
		
		System.out.println(christinaPage.getInfo());
}

}
