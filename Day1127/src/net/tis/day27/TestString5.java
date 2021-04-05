package net.tis.day27;

public class TestString5 {
	public static void main(String[] args) {
		//359페이지 String 클래스
		//char CharAt(int)사용 int length() 사용
		String data="3 t 1 s 7 k";
		String msg=" "; //변수초기화
		int size=data.length();
		
		for (int i=0; i<size/2+1; i++) {			
			char a = data.charAt(i*2);
			System.out.print(a);
		}
		
		//공백제거 3t1s7k
			
	}//end
}//class end
