package Iot_Java.day06;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int left, right;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("left : ");
		left = sc.nextInt();
		System.out.println("Right : ");
		right = sc.nextInt();
		
		// left 부터 right 까지의 모든 수들 중에서,
		for(int i = left; i <= right; i++) {
			int cnt = 0;// 약수의 개수를 카운트 할 변수
			for(int j = 1; j <= i; j++) { // 1 - 13
			// 약수인지 확인 후 카운트 증가
				if(i % j == 0) {
					System.out.print(j + "\t");
					cnt++;
				}
				
			}
			// 약수의 갯수가 짝수인 수는 더하고, 약수의 갯수가 홀수인 수는 빼고
			if(cnt % 2 == 0) {
				sum = sum + i;					
			} else {
				sum = sum - i;
			}
		}
		// 최종 결과값(합) 출력
		System.out.println(sum);
	}
	
}