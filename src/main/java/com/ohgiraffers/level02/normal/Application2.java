package com.ohgiraffers.level02.normal;

public class Application2 {

	public static void main(String[] args) {

		double num1 = 80.5;
		double num2 = 50.6;
		double num3 = 70.8;

		double num4 = num1 + num2 + num3;
		double num5 = num4 / 3;

		int num6 = (int)num4;
		int num7 = (int)num5;

		System.out.println("총점 : " + num6);
		System.out.println("평균 : " + num7);
		/* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
		 * 총점과 평균을 정수 형태로 출력하세요
		 * 
		 * -- 출력 예시 --
		 * 총점 : 201
		 * 평균 : 67
		 *  */
		
	}

}
