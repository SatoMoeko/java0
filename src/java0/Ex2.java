package java0;

public class Ex2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double d=3;
		System.out.println(d);
		String s = "ベスト"+3;
		System.out.println(s);
		
		float f =3;
		double d2 = f;
		System.out.println(f);	
		System.out.println(d2);
	
		//intでキャストする
		int age = (int)3.2;
		System.out.println(age);
		
		int sum = 320;
		int people = 7;
		//doubleでキャストする
		double avg = (double)sum/people;
		System.out.println(avg);
		
		double d3 = 8.5/2;
		long l = 5+2L;//long型を指定するときはLをつける
		long l2 = 589845293285485L;
		float f2 =3.2f;//float型を指定するときはｆをつける
		System.out.println(d3);
		System.out.println(l);
		System.out.println(l2);
		System.out.println(f2);
		
		char c1 ='G';
		String c2 ="B";
		String c3 ="";//文字がはいってないと空文字といわれる
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);//printlnは表示したあとに改行する意味
		
		
		

	}

}
