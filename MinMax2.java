package Iot_Java.day06;

import java.util.Scanner;

public class MinMax2 {
	public static void main(String[] args) {
		/* �� ���� ���ڸ� �Է¹޾� �Է� ���� ���� �߿��� ū���� ����ϴ� ���α׷��� �ۼ� 
		 * 
		 * ���ѻ��� : ���� �����ڸ� Ȱ���Ͻÿ�.
		 * 
		 * ����¿���:
		 * �Է�		���
		 * 54 100   "ū��: 100, ������: 54"
		 * */
		Scanner sc = new Scanner(System.in);
		// �� ���� ���ڸ� ���� ū ���� max������, ���� ���� min ������ ����
		// min, max ���
		System.out.println("���� 1: ");
		int num1 = sc.nextInt();
		System.out.println("���� 2: ");
		int num2 = sc.nextInt();
		int min = (num1 > num2) ? num2 : num1 ;
		int max = (num1 > num2) ? num1 : num2 ;
		// min, max ���
		System.out.println("ū ��: " + max + ", ���� ��: " +  min);
		
		
	}
}
