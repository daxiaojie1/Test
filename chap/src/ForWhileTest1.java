import java.util.Scanner;

public class ForWhileTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0; //记录正数的个数
        int negativeCount = 0; //记录负数的个数
        for(;;){
            System.out.println("Enter number: ");
            int number = sc.nextInt(); // 获取用户输入的整数

            if(number > 0){
                positiveCount++;
            }else if(number < 0){
                negativeCount++;
            }else{
                System.out.println("程序结束");
                break;
            }
        }
        System.out.println("正数的个数为：" + positiveCount);
        System.out.println("负数的个数为：" + negativeCount);

        sc.close();
    }
}
