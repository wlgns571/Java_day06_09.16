package Iot_Java.day06;

import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		/* 
		 * 두개의 숫자를 입력받아 두 숫자 사이(범위)에
		 * 해당하는 7의 배수를 출력하는 프로그램을 작성하시오.
		 * */
		// 입출력예시
		// 입력               출력
		// begin     end     14, 21, 28, 35,....98
		//  10       100
		Scanner sc = new Scanner(System.in);
		// 두개의 숫자를 입력받기
		System.out.println("숫자 1: ");
		int begin = sc.nextInt();
		System.out.println("숫자 2: ");
		int end = sc.nextInt();
		
			// 두개의 숫자 범위 탐색하기(반복문 활용)
		for(int i = begin; i <= end; i++) {
			
			// 7의 배수를 판별한 후 출력
			if( i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 1; ; i++) {
			int m = begin * 7; // 7의 배수 출력
			if(m >100) {
				break; // 루프 끝내기.
			}
			if(m >= 100 && m <= 100) {
				System.out.println(m);
			}
			}
		}
	}
