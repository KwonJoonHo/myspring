package net.tis.day27;

public class TestString5 {
	public static void main(String[] args) {
		//359������ String Ŭ����
		//char CharAt(int)��� int length() ���
		String data="3 t 1 s 7 k";
		String msg=" "; //�����ʱ�ȭ
		int size=data.length();
		
		for (int i=0; i<size/2+1; i++) {			
			char a = data.charAt(i*2);
			System.out.print(a);
		}
		
		//�������� 3t1s7k
			
	}//end
}//class end
