package com.simplilearn.arithmetic.calculator;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		// Scanner objects are created to take input from the user through console
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		
		System.out.println("Enter Numbers for Arithmetic Calculations.....");
		
		double number1 = num1.nextDouble();
		double number2 = num2.nextDouble();
		
		System.out.println("First Number Entered by the user is: " + number1);
		System.out.println("Second Number Entered by the user is: " + number2);
		
		// Created an object of a class to call all the arithmetic operations
		ArithmeticCalculator arithCalc = new ArithmeticCalculator();
		
		double additionResult = arithCalc.addition(number1, number2); // Calling addition operation
		
		double subtractionResult = arithCalc.substraction(number1, number2); // Calling subtraction operation
		
		double multiplicationResult = arithCalc.multiplication(number1, number2); // Calling multiplication operation
		
		double divisionResult = arithCalc.division(number1, number2); // Calling division operation
	
		System.out.println("Arithmetic Operations Results are given below:: ");
		
		System.out.println(number1 + " + " + number2 + " = " + (additionResult));
		System.out.println(number1 + " - " + number2 + " = " + (subtractionResult));
		System.out.println(number1 + " * " + number2 + " = " + (multiplicationResult));
		System.out.println(number1 + " / " + number2 + " = " + (divisionResult));
	
	}
	
	// First Arithmetic Operation - Addition
	public double addition(double num1, double num2) {
		
		return num1 + num2;
	}
	
	// Second Arithmetic Operation - Subtraction
	public double substraction(double num1, double num2) {
			
		return num1 - num2;
	}
	
	// Third Arithmetic Operation - Multiplication
	public double multiplication(double num1, double num2) {
			
		return num1 * num2;
	}
	
	// Fourth Arithmetic Operation - Division
	public double division(double num1, double num2) {
				
		return num1 / num2;
	}

}
