package day3HW;

public class Day3HWClass2 {

	public static void main(String[] args) {
		
		Day3HWClass2 obj = new Day3HWClass2();
		getAddress();
		
		int r=obj.divide(4, 2);
		System.out.println(r);
		
		

	}

	public static void getAddress() {
		System.out.println("123 Street");

	}

	public int divide(int a, int b) {
		return a / b;
	}
}
