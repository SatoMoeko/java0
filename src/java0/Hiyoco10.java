package java0;

public class Hiyoco10 {

	public static void main(String[] args) {
		// 1. 0~5のランダムな整数を生成し、int型変数xに代入し出力せよ。
		int x= new java.util.Random().nextInt(5);
		System.out.println(x);
		
		//2. 10000~20000のランダムな整数を生成し、int型変数xに代入し出力せよ。
		int y=new java.util.Random().nextInt(10001)+10000;
		System.out.println(y);
		//3. -10~20のランダムな整数を生成し、int型変数xに代入し出力せよ。
		int z=new java.util.Random().nextInt(31)-10;
		System.out.println(z);
	}

}
