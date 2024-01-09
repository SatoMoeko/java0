package java0;

public class Ex16 {

	public static void main(String[] args) {
		int dice;
		do {
			dice = new java.util.Random().nextInt(6)+1;
			System.out.println(dice);
		}while(dice !=6);
		System.out.println("END");
	}

}
