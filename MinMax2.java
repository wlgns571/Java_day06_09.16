package Iot_Java.day06;

import java.util.Scanner;

public class MinMax2 {
	public static void main(String[] args) {
		/* 두 개의 숫자를 입력받아 입력 받은 숫자 중에서 큰수를 출력하는 프로그램을 작성 
		 * 
		 * 제한사항 : 삼항 연산자를 활용하시오.
		 * 
		 * 입출력예시:
		 * 입력		출력
		 * 54 100   "큰수: 100, 작은수: 54"
		 * */
		Scanner sc = new Scanner(System.in);
		// 두 개의 숫자를 비교후 큰 수는 max변수에, 작은 수는 min 변수에 저장
		// min, max 출력
		System.out.println("숫자 1: ");
		int num1 = sc.nextInt();
		System.out.println("숫자 2: ");
		int num2 = sc.nextInt();
		int min = (num1 > num2) ? num2 : num1 ;
		int max = (num1 > num2) ? num1 : num2 ;
		// min, max 출력
		System.out.println("큰 수: " + max + ", 작은 수: " +  min);
		
		
	}
}
