package java0;

public class Hiyoco3 {

	public static void main(String[] args) {
		int dice1 = new java.util.Random().nextInt(6)+1;
		System.out.println("ダイス１："+dice1);
		int dice2 = new java.util.Random().nextInt(6)+1;
		System.out.println("ダイス２："+dice2);
		if(dice1 == dice2) {
			
			System.out.println("点数："+(dice1+dice2)*2);
		} else {
			System.out.println("点数："+(dice1+dice2));
		}

	}

}
