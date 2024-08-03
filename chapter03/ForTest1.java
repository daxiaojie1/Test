class ForTest1 {
	public static void main(String[] args) {
		
		//遍历所有的3位数
		for (int i = 100;i <= 999 ;i++){

			//针对每一个三位数i，获取其各个位上的数
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i /100;

			//判断是否满足水仙花数的规则
			if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai){
				System.out.println(i);
			}
		}
	}
}
