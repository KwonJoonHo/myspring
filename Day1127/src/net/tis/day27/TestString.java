package net.tis.day27;

public class TestString {
	public static void main(String[] args) {
		String x = "blue" ;
		String y = "blue" ;
		String a = new String("blue") ;
		String b = new String("blue") ;
		if(x==y) {
			System.out.println("blue같은 데이터 입니다 O"); }
		else {System.out.println("blue다른 데이터 입니다 x");	}

		System.out.println();
		if(a.equals(b)) {System.out.println("blue같은 데이터 입니다 O");}
		else {System.out.println("blue다른 데이터 입니다 x");	}
		
		System.out.println();
		int su=7;
		try {
		System.out.println(su+"/"+0+"="+(su/0));
		System.out.println(su+"%"+4+"="+(su%4));
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.toString());
		}	
		System.out.println("영수증출력");
		System.out.println("주차비면제");
		System.out.println("주차비영수증대체");
		
	}//end
}//class end
