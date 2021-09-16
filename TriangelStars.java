package Iot_Java.day06;

public class TriangelStars {
	public static void main(String[] args) {
		/* 
		 * ����� ���� ������ �Է¹޾� ���� �ﰢ���� �׸��ÿ�.
		 * ***   *     ***
		 * ***   **    **
		 * ***   ***   *
		 * */
		final int SIZE = 5;
		// 1�� �����
		for (int i = 1; i <= SIZE; i++) {
			for ( int j = 1; j <= SIZE; j++) {
				System.out.print("*");
				// println�� ��� �� �ٹٲ��϶�� ��.
			}
			System.out.println();
		}
		// 2�� �����
		for (int i = 1; i <= SIZE; i++) {
			for ( int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 3�� �����
		for (int i = 1; i <= SIZE; i++) {
			for ( int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for ( int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 4�� �����
		for (int i = 1; i <= SIZE; i++) {
			for ( int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for ( int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 5�� �����
		for (int i = 1; i <= SIZE; i++) {
			for ( int j = 1; j < (SIZE - i) + 1; j++) {
				System.out.print(" ");
			}
			for ( int k = 1; k < 2 * i; k++) {
				System.out.print("*");
				}
			System.out.println();
		}
		// 6�� �����
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