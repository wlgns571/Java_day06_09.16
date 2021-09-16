package Iot_Java.day06;

public class TriangelStars {
	public static void main(String[] args) {
		/* 
		 * 출력할 별의 개수를 입력받아 별난 삼각형을 그리시오.
		 * ***   *     ***
		 * ***   **    **
		 * ***   ***   *
		 * */
		final int SIZE = 5;
		// 1번 별찍기
		for (int i = 1; i <= SIZE; i++) {
			for ( int j = 1; j <= SIZE; j++) {
				System.out.print("*");
				// println은 출력 후 줄바꿈하라는 뜻.
			}
			System.out.println();
		}
		// 2번 별찍기
		for (int i = 1; i <= SIZE; i++) {
			for ( int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 3번 별찍기
		for (int i = 1; i <= SIZE; i++) {
			for ( int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for ( int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 4번 별찍기
		for (int i = 1; i <= SIZE; i++) {
			for ( int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for ( int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 5번 별찍기
		for (int i = 1; i <= SIZE; i++) {
			for ( int j = 1; j < (SIZE - i) + 1; j++) {
				System.out.print(" ");
			}
			for ( int k = 1; k < 2 * i; k++) {
				System.out.print("*");
				}
			System.out.println();
		}
		// 6번 별찍기
		for (int i = 1; i <= SIZE; i++) {
			for ( int j = 1; j < i + 1; j++) {
				System.out.print(" ");
			}
			for ( int k = 1; k < (SIZE - i) * 2; k++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
}