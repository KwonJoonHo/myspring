package net.tis.day27;

public class TestWrapper {
	public static void main(String[] args) {
		String a="2400";
		//¿¡·¯ int x=(int)a;
		int x=Integer.parseInt(a) ;
		System.out.println(a+198); //2400198
		System.out.println(x+198); //2598
		System.out.println();
		
		String b="78.9";
		double y = Double.parseDouble(b);
		System.out.println(b+198); //78.9198
		System.out.println(y+198); //276.9
		System.out.println();
				
	}

}
