import java.util.Scanner;
class ScannerTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("��ӭ");
		System.out.print("������������");

		String name = scan.next();

		System.out.print("���������䣺");
		int age = scan.nextInt();

		System.out.print("���������أ�");
		double weight =scan.nextDouble();

		System.out.print("�����뵥��");
		boolean isSingle = scan.nextBoolean();

		System.out.print("�������Ա�");
		char gender = scan.next().charAt(0);

		System.out.println("wa" + name);

		System.out.println("o");

		scan.close();
	}
}
