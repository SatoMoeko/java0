package java0;

public class Hiyoco2 {

	public static void main(String[] args) {
		System.out.print("身長は何cmですか？>>");
		int height = new java.util.Scanner(System.in).nextInt();
		if (height >= 50 && height <= 300 ) {//&&でなく||にしてしまうとすべての数がOKになってしまう
			System.out.println("ok");
		}else {
			System.out.println("NG");
		}
		
		
	}

}
