import java.util.Scanner;

class WhileTest1 {
	public static void main(String[] args) {
		//���һ�������
		int random = (int) (Math.random() * 100) + 1;

		//��Scanner�Ӽ��̻�ȡ����
		Scanner scan = new Scanner(System.in);
		System.out.print("������1-100��һ������");
		int guess = scan.nextInt();

		//����һ����������¼�µĴ���
		int guessCount = 0;

		//ʹ��ѭ���ṹ�����ж��ѭ���ĶԱȺͻ�ȡ����
		while (random != guess){
			if (guess > random){
				System.out.println("����");
			}else if (guess < random){
				System.out.println("С��");
			}
			
			System.out.print("������1-100��һ������");
			guess = scan.nextInt();
			guessCount++;
		}
		System.out.print("success");
		System.out.print("��" + guessCount + "��");

		scan.close();
	}
}