package java0;

public class Hiyoco13 {

	public static void main(String[] args) {
		System.out.print("大きさは？>>");
		int n = new java.util.Scanner(System.in).nextInt();
		//二重for文
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
