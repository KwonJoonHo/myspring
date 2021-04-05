package net.tis.day27;

public class TestChar {
	public static void main(String[] args) {
		char a='B', b='1',c=57; ; //char타입은 int형으로 변환
		//48=0, 49=1 ~아스키 55=7 56=8
		System.out.println(a+"\t"+b+ "\t" +c);
		
		int x = (int)a ;
		int y = (int)b ;
		int z = (int)c ;
		System.out.println(x+"\t" + y + "\t" + z);
		
	}//end
}//class END
