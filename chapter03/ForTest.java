class ForTest {
	public static void main(String[] args) {
		for(int i = 1;i <=5;i++){
			System.out.println("Hello World!");
		}
		int num = 1;
        for(System.out.print("a");num < 3;System.out.print("c"),num++){
            System.out.print("b");
		}

		int count = 0;
		
		int sum = 0;

		for (int i = 1;i <= 100 ;i++){
			if (i %2 == 0){
				System.out.println(i);
				count++;
				sum +=i;
			}
		}
		System.out.println("偶数的个数为" + count);
		System.out.println("偶数的和为" + sum);
	}
}
