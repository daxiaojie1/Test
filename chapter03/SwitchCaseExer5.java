import java.util.Scanner;

public class SwitchCaseExer5 {
    public static void main(String[] args) {
        //1���������3��1-6������
        int a = (int)(Math.random()*6 + 1);
        int b = (int)(Math.random()*6 + 1);
        int c = (int)(Math.random()*6 + 1);

        //2��Ѻ��
        Scanner input = new Scanner(System.in);
        System.out.print("��Ѻ�������ӡ���С����");
        String ya = input.next();
        input.close();

        //3���жϽ��
        boolean result = false;
        //switch֧��String����
        switch (ya){
            case "����": 
				result = a == b && b == c; 
				break;
            case "��": 
				result = a + b + c > 9; 
				break;
            case "С": 
				result = a + b + c <= 9; 
				break;
            default:
				System.out.println("��������");
        }

        System.out.println("a,b,c�ֱ��ǣ�" + a + "," + b + "," + c );
        System.out.println(result ? "������" : "�´���");
    }
}