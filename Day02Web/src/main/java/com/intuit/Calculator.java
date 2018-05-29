package com.intuit;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int square(int num) {
		return num * num;
	}
}
