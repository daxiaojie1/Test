class ForTest1 {
	public static void main(String[] args) {
		
		//�������е�3λ��
		for (int i = 100;i <= 999 ;i++){

			//���ÿһ����λ��i����ȡ�����λ�ϵ���
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i /100;

			//�ж��Ƿ�����ˮ�ɻ����Ĺ���
			if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai){
				System.out.println(i);
			}
		}
	}
}
