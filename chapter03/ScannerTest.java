import java.util.Scanner;
class ScannerTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("欢迎");
		System.out.print("请输入网名：");

		String name = scan.next();

		System.out.print("请输入年龄：");
		int age = scan.nextInt();

		System.out.print("请输入体重：");
		double weight =scan.nextDouble();

		System.out.print("请输入单身：");
		boolean isSingle = scan.nextBoolean();

		System.out.print("请输入性别");
		char gender = scan.next().charAt(0);

		System.out.println("wa" + name);

		System.out.println("o");

		scan.close();
	}
}
