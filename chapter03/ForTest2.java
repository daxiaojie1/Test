class ForTest2 {
	public static void main(String[] args) {
		int m = 12;
		int n = 20;
	//��Լ��i

		//��ȡm��n�еĽ�Сֵ
		int min =(m < n) ? m : n;


		//fa1 ��С�����г����й�Լ��

		/*
		int result = 1;
		for (int i = 1;i <= min;i++ ){
			if(m % i == 0 && n % i == 0){
				result = i;
			}
		}
		System.out.println(result);
		*/

		//fa2 �Ӵ�С�г����й�Լ������break����ֻ������Լ��
		for (int i = min;i >=1 ;i-- ){
			if (m % i ==0 && n % i == 0){
				System.out.println("���Լ��Ϊ" + i);
				break;
			}
		}



		//������
		int max = (m>n) ? m : n;
		for (int i = max;i <= min ;i++ ){
			if (i % m ==0 && i % n == 0){
				System.out.println("��С������Ϊ" + i);
				break;
		}
	}
}
