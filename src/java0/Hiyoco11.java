package java0;

public class Hiyoco11 {

	public static void main(String[] args) {
		System.out.print("1. キーボードから整数を受け取りint型変数xに代入し、xを出力する処理を作成せよ。>>");
		int x= new java.util.Scanner(System.in).nextInt();
		System.out.println(x);
		
		System.out.print("2. キーボードから小数を受け取りdouble型変数yに代入し、yを出力する処理を作成せよ。>>");
		double y=new java.util.Scanner(System.in).nextDouble();
		System.out.println(y);
		
		System.out.print("3. キーボードからappleなどの単語を受け取りString型変数sに代入しsを出力する処理を作成せよ。>>");
		String s= new java.util.Scanner(System.in).nextLine();
		System.out.println(s);
		
		System.out.print("//4. キーボードから「山田 太郎」などの空白を含む１行を受け取りString型変数sに代入しsを出力する処理を作成せよ>>");
		String s2 =new java.util.Scanner(System.in).nextLine();
		System.out.println(s2);
	}

}
