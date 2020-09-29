package by.htp.les20.classes;

public class Test1 {

	private int age1;
	private int age2;
	
	public Test1() {
	}

	public void print() {
		System.out.println("Age1=" + age1);
		System.out.println("Age2=" + age2);
	}

	public void setAge1(int a) {
		this.age1 = a;
	}

	public void setAge2(int b) {
		this.age1 = b;
	}

	public int sum() {
		return age1 + age2;
	}

	public int findMore() {
		if (age1 > age2) {
			return age1;
		} else if(age2>age1){
			return age2;
		}else {
			return age1&age2;
		}
	}
}
