class WhileTest2 {
	public static void main(String[] args) {
		double paper =0.1;
		double zf = 8848860;

		int count = 0;

		while (paper <= zf){
			paper *=2;
			count++;
		}
		System.out.println("paper�ĸ߶�Ϊ" + paper/1000 + "m");
		System.out.println("��Ҫ��" + count + "��");
	}
}
