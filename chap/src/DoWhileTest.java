import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {

        double balance = 0.0; //初始化 以表余额

        Scanner scan = new Scanner(System.in); //实例化Scanner

        boolean flag = true; //控制循环的结束

        do{
            //声明ATM取款页面
            System.out.println("=========ATM========");
            System.out.println("   1、存款");
            System.out.println("   2、取款");
            System.out.println("   3、显示余额");
            System.out.println("   4、退出");
            System.out.println("请选择(1-4)：");

            //用Scanner获取用户的选择

            int selection = scan.nextInt();
            switch(selection){
                //根据用户的选择，进行对应操作
                case 1:
                    System.out.println("请输入存款的金额：");
                    double money1 = scan.nextDouble();
                    if(money1 > 0){
                        balance += money1;
                    }
                    break;
                case 2:
                    System.out.println("请输入取款的金额：");
                    double money2 = scan.nextDouble();
                    if(money2 > 0 && money2 <= balance){
                        balance -= money2;
                    }else{
                        System.out.println("余额不足");
                    }
                    break;
                case 3:
                    System.out.println("您的账户的余额为" + balance );
                    break;
                case 4:
                    flag = false;
                    System.out.println("感谢使用，欢迎下次光临");
                    break;
                default:
                    System.out.println("您的输入有误，请输入1-4");
            }
        }while(flag);

        //关闭资源
        scan.close();
    }
}
