package java0;

public class Ex7 {

	public static void main(String[] args) {
		int fortune = new java.util.Random().nextInt(8)+1;
		switch(fortune) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("大吉");
			break;
		case 5:
			System.out.println("中吉");
			break;
		case 6:
			System.out.println("吉");
			break;
		default:
			System.out.println("凶");
			break;
		}

	}

}
