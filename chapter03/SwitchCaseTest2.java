import java.util.Scanner;

class SwitchCaseTest2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入year");
		int year = scan.nextInt();

		System.out.println("请输入month：");
		int month = scan.nextInt();

		System.out.println("请输入day：");
		int day = scan.nextInt();

		int sumDays = 0;
		/*
		switch (month){
		case 1:
			sumDays = day;
			break;
		case 2:
			sumDays = 31 + day;
			break;
		case 3:
			sumDays = 31 + 28 + day;
			break;
		case 4:
			sumDays = 31 + 28 + 31 + day;
			break;
		case 5:
			sumDays = 31 + 28 + 31 + 30 + day; 
		}
*/

		switch (month){
		case 12:
			sumDays += 30;
		case 11:
			sumDays += 31;
		case 10:
			sumDays += 30;
		case 9:
			sumDays += 31;
		case 8:
			sumDays += 31;
		case 7:
			sumDays += 30;
		case 6:
			sumDays += 31;
		case 5:
			sumDays += 30;
		case 4:
			sumDays += 31;
		case 3:
			sumDays += 28;
			if (year % 4 && year % 100 !=0 || year %400 ==0){
				sumDays ++;
			}
		case 2:
			sumDays += 31;
		case 1:
			sumDays += day;
		}

		System.out.println(year + "年" + month + "月" + day + "日是当前的第" + sumDays + "天");

		scan.close();
	}
}
