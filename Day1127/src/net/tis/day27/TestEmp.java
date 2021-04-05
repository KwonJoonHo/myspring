package net.tis.day27;

public class TestEmp {
	public String name;
	public int age;

	public static void main(String[] args) {
		TestEmp te = new TestEmp();
		te.input();
		String a = te.toString();
		System.out.println(a);
		System.out.println(te);
		System.out.println(te.toString());
		
	}//end
	
	public void input( ) { //input메소드대신 생성자
		String name="동원";
		int age=34;
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "이름="+this.name+"\t나이="+this.age; //길동 27 출력
		
	}//end

}
