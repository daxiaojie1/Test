class ConditionExer {
	public static void main(String[] args) {
		
		int week = 2;
		week = 4;

		week += 10;

		week %= 7;
		System.out.println("今天是周二，10天以后是周" + ((week == 0)? "日" : week));
	}
}
