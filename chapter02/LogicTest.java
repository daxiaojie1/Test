class LogicTest {
	public static void main(String[] args) {
		
		boolean b1 = true;
		b1 = false;

		int num1 = 10;

		if(b1 & (num1++ > 0)){
			System.out.println("Hello World!");
		}else{
			System.out.println("Hello");
		}
		System.out.println("num1����" + num1);


		boolean b2 = true;
		b2=false;
		
		int num2 = 10;

		if(b2 && (num2++ > 0)){
			System.out.println("Hello World!");
		}else{
			System.out.println("Hello");
		}
		System.out.println("num2����" + num2);
	}
}
