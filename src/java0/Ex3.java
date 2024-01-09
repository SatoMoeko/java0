package java0;

public class Ex3 {

	public static void main(String[] args) {
		System.out.print("Hello");
		System.out.print("World");
		System.out.println();//改行だけする命令
		
		int m= Math.max(5, 8);
		System.out.println(m);//8
		int m2= Math.min(4, 12);
		System.out.println(m2);//4
		//文字列からintに変換
		int n1 = Integer.parseInt("302");
		System.out.println(n1);
		//intから文字列に変換
		String s1 = String.valueOf(10);
		String s2 = 10+"";//"10"
		System.out.println(s1);
		System.out.println(s2);
		
		int r = new java.util.Random().nextInt(6);//0~5の６種類からランダム表示
		System.out.println(r);
		int r2 = new java.util.Random().nextInt(6)+1;//1~5の６種類からランダム表示
		System.out.println(r2);
		
		
		
		
		
				

	}

}
