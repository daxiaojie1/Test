class IfElseTest {
	public static void main(String[] args) {
		int heartBeats = 89;

		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("��");
		}

		System.out.println("Hello World!");



		int num = 13;

		if(num % 2 == 0){
			System.out.println(num + "��ŷʽ");
		}else{
			System.out.println(num + "�Ǽ���");
		}

		int score = 67;

		if (score == 100){
			System.out.println("1");
		}else if (score > 80 && score <= 99){
			System.out.println("2");
		}else if (score >= 60 && score <= 80){
			System.out.println("3");
		}else{
			System.out.println("4");
		}
	}
}