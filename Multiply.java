package Iot_Java.day06;

import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		/* 
		 * �ΰ��� ���ڸ� �Է¹޾� �� ���� ����(����)��
		 * �ش��ϴ� 7�� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * */
		// ����¿���
		// �Է�               ���
		// begin     end     14, 21, 28, 35,....98
		//  10       100
		Scanner sc = new Scanner(System.in);
		// �ΰ��� ���ڸ� �Է¹ޱ�
		System.out.println("���� 1: ");
		int begin = sc.nextInt();
		System.out.println("���� 2: ");
		int end = sc.nextInt();
		
			// �ΰ��� ���� ���� Ž���ϱ�(�ݺ��� Ȱ��)
		for(int i = begin; i <= end; i++) {
			
			// 7�� ����� �Ǻ��� �� ���
			if( i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 1; ; i++) {
			int m = begin * 7; // 7�� ��� ���
			if(m >100) {
				break; // ���� ������.
			}
			if(m >= 100 && m <= 100) {
				System.out.println(m);
			}
			}
		}
	}
