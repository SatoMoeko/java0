package java0;

public class Dice {

	public static void main(String[] args) {
		int dice1 = new java.util.Random().nextInt(6)+1;
		System.out.println("ダイス1:"+dice1);
		int dice2 = new java.util.Random().nextInt(6)+1;
		System.out.println("ダイス2:"+dice2);
		int score = dice1+dice2;
		if(dice1 ==dice2) {
			score *= 2;
		}
		System.out.println("work："+score);
	}

}
