class ForTest2 {
	public static void main(String[] args) {
		int m = 12;
		int n = 20;
	//公约数i

		//获取m和n中的较小值
		int min =(m < n) ? m : n;


		//fa1 从小到大列出所有公约数

		/*
		int result = 1;
		for (int i = 1;i <= min;i++ ){
			if(m % i == 0 && n % i == 0){
				result = i;
			}
		}
		System.out.println(result);
		*/

		//fa2 从大到小列出所有公约数，用break限制只输出最大公约数
		for (int i = min;i >=1 ;i-- ){
			if (m % i ==0 && n % i == 0){
				System.out.println("最大公约数为" + i);
				break;
			}
		}



		//公倍数
		int max = (m>n) ? m : n;
		for (int i = max;i <= min ;i++ ){
			if (i % m ==0 && i % n == 0){
				System.out.println("最小公倍数为" + i);
				break;
		}
	}
}
