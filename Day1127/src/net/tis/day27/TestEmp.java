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
	
	public void input( ) { //input�޼ҵ��� ������
		String name="����";
		int age=34;
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "�̸�="+this.name+"\t����="+this.age; //�浿 27 ���
		
	}//end

}
