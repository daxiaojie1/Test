public class ForForTest {
    public static void main(String[] args) {

        //打印1行6个*
        for(int i=1;i<=6;i++){
            System.out.print('*');
        }

        System.out.println("\n下一个案例");

        //打印5行6个*
        for(int j=1;j<=5;j++){

            for(int i=1;i<=6;i++){
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\n下一个案例");

        //打印5行直角三角形
        /*

         *
         **
         ***
         ****
         *****

         */
        for(int j=1;j<=5;j++){
            for(int i=1;i<=j;i++){
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\n下一个案例");

        //打印5行倒直角三角形
        /*

         *****
         ****
         ***
         **
         *

         */
        for(int j=1;j<=5;j++){
            for(int i=1;i<=7-j;i++){
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\n下一个案例");

        //打印"菱形"形状的图案
        /*

--------*				1				8						1                     k = 2 * i - 1
------* * *				2				6						3
----* * * * *			3				4						5
--* * * * * * *			4				2						7
* * * * * * * * *

         */

        //上半部分
        for(int j=1;j<=5;j++){
            //-
            for(int i=1;i<=10-2*j;i++){
                System.out.print('-');
            }

            //*
            for(int k=1;k<=2*j -1;k++){
                System.out.print("* ");
            }

            System.out.println();
        }

        //下半部分
        for(int j=1;j<=5;j++){
            //-
            for(int i=1;i<=2*j;i++){
                System.out.print('-');
            }

            //*
            for(int k=1;k<=9-2*j;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
