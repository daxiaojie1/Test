class StringTest {
	public static void main(String[] args) {
		String str1="h";
		System.out.println("str1");
		System.out.println(str1);

		int num1=10;
		boolean b1=true;
		String str4="h";
		System.out.println(str4+b1);

		String str5=str4+b1;
		String str6=str4+b1+num1;
		System.out.println(str6);

		//String str7=b1+num1+str4;

		int num2=10;
		String str9=num2+"";
		System.out.println(str9);

		int num3=Integer.parseInt(str9);
		System.out.println(num3+1);
	}
}
