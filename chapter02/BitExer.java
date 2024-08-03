class BitExer {
	public static void main(String[] args) {
		int m = 10;
		int n = 20;
		
		int temp = m;
		m = n;
		n = temp;
		System.out.println("m = " + m + ",n = " + n);
	}
}
