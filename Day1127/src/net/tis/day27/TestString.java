package net.tis.day27;

public class TestString {
	public static void main(String[] args) {
		String x = "blue" ;
		String y = "blue" ;
		String a = new String("blue") ;
		String b = new String("blue") ;
		if(x==y) {
			System.out.println("blue���� ������ �Դϴ� O"); }
		else {System.out.println("blue�ٸ� ������ �Դϴ� x");	}

		System.out.println();
		if(a.equals(b)) {System.out.println("blue���� ������ �Դϴ� O");}
		else {System.out.println("blue�ٸ� ������ �Դϴ� x");	}
		
		System.out.println();
		int su=7;
		try {
		System.out.println(su+"/"+0+"="+(su/0));
		System.out.println(su+"%"+4+"="+(su%4));
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.toString());
		}	
		System.out.println("���������");
		System.out.println("���������");
		System.out.println("�����񿵼�����ü");
		
	}//end
}//class end
