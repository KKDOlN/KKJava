package com.kk.day02.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		/* 
		 * 논리연산자
		 * 조건 2개이상의 경우 조건의 결과를
		 * 연결해주는 연산자
		 * 1. 남자이면서 평균평점 4.0이상인 사람
		 * 2. 컴퓨터공학과 또는 경영학과인 사람
		 */
		boolean result1, result2, result3, result4;
		// AND -> &&, OR -> ||
		int num1 = 50;
		int num2 = 30;
		result1 = (num1 == num2) && (num1 < num2); // false
		result2 = (num1 < num2) || (num1 == num2); // false
		result3 = (num1 > num2) && (num1 != num2); // true
		result4 = (num1 > num2) || (num1 == num2); // true
		System.out.println("결과값1 : " + result1);
		System.out.println("결과값2 : " + result2);
		System.out.println("결과값3 : " + result3);
		System.out.println("결과값4 : " + result4);
		
		/*
		 * 문제 
		 * a는 70, b는 55입니다
		 * a: 70, b: 55
		 * result 1 = (a == b) || (a++ < 100); 
		 * 			= (70 == 55) || (70 < 100); true;
		 * a: 71, b: 55
		 * result 2 = (a < b) && (--b < 55); f
		 * 			= (71 <55) && x = false;
		 * a: 71, b: 55
		 * result 3 = (a !=b) && (b-- < a++); t
		 * 			= (71 != 55) && (55 < 71) = true;
		 * a: 72, b: 54
		 * result 4 = (a++ != b) || (b++ >= 85); t
		 * 			= (72 != 54) || X = true;
		 * a: 73, b : 54
		 * result 1, result2, result3, result4의 결과값과
		 * a, b의 값을 예상해보세요.
		 * result1: ?, result2: ?, result3: ?, result4: ?,
		 * result1: true, result: false, result3: true , result4: true 
		 * a: ?, b: ?
		 * a: 73, b: 54
		 */
		
	}
}
