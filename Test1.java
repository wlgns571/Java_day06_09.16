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
		
		// left ���� right ������ ��� ���� �߿���,
		for(int i = left; i <= right; i++) {
			int cnt = 0;// ����� ������ ī��Ʈ �� ����
			for(int j = 1; j <= i; j++) { // 1 - 13
			// ������� Ȯ�� �� ī��Ʈ ����
				if(i % j == 0) {
					System.out.print(j + "\t");
					cnt++;
				}
				
			}
			// ����� ������ ¦���� ���� ���ϰ�, ����� ������ Ȧ���� ���� ����
			if(cnt % 2 == 0) {
				sum = sum + i;					
			} else {
				sum = sum - i;
			}
		}
		// ���� �����(��) ���
		System.out.println(sum);
	}
	
}