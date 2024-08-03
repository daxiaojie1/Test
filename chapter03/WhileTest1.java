import java.util.Scanner;

class WhileTest1 {
	public static void main(String[] args) {
		//获得一个随机数
		int random = (int) (Math.random() * 100) + 1;

		//用Scanner从键盘获取数据
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入1-100的一个整数");
		int guess = scan.nextInt();

		//声明一个变量，记录猜的次数
		int guessCount = 0;

		//使用循环结构，进行多次循环的对比和获取数据
		while (random != guess){
			if (guess > random){
				System.out.println("大了");
			}else if (guess < random){
				System.out.println("小了");
			}
			
			System.out.print("请输入1-100的一个整数");
			guess = scan.nextInt();
			guessCount++;
		}
		System.out.print("success");
		System.out.print("共" + guessCount + "次");

		scan.close();
	}
}
