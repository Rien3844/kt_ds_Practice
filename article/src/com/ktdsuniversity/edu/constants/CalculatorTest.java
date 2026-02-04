package com.ktdsuniversity.edu.constants;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator(40, 20);
		
		System.out.println(calc.compute(Calculator.ADD));
		System.out.println(calc.compute(Calculator.SUB));
		System.out.println(calc.compute(Calculator.MUL));
		System.out.println(calc.compute(Calculator.DIV));
		
		System.out.println("----------------------------");
		
		System.out.println(calc.compute(1));
		System.out.println(calc.compute(2));
		System.out.println(calc.compute(3));
		System.out.println(calc.compute(4));
		// 문제점 1. 위와 아래가 같은 코드 ==> class를 확인하지 않으면 의미를 알아채기가 힘듦.
		// ==> 내가 전달하는 것에 대해 올바른 값, 의미를 전달하지 못함.
		

		System.out.println(calc.compute2(Operator.ADD));
		System.out.println(calc.compute2(Operator.SUB));
		System.out.println(calc.compute2(Operator.MUL));
		System.out.println(calc.compute2(Operator.DIV));
	}
}
