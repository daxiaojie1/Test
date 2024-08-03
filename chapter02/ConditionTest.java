class ConditionTest {
	public static void main(String[] args) {
		String info = (2>1)?"1":"2";
		System.out.println(info);

		int i = 20;
		int j = 30;
		int k = 23;
		
		int tempMax = (i > j)? i : j;
		int finalMax = (tempMax > k)? tempMax : k;
		System.out.println(finalMax);
	}
}
