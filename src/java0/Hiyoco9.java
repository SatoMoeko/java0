package java0;

public class Hiyoco9 {

	public static void main(String[] args) {
		// 1. int型の変数xに10を代入し、xが5より大きい場合「xは5より大きいです」と出力するプログラムを作成せよ。
		int x=10;
		if(x>5) {
			System.out.println(x+"は5より大きいです");
		}
		//2. int型の変数yに5を代入し、yが10より小さい場合「yは10より小さいです」と出力するプログラムを作成せよ。
		int y= 5;
		if(y<10) {
			System.out.println(y+"は10より小さいです");
		}
		//3. int型の変数aに10を代入し、aが10である場合「aは10です」と出力するプログラムを作成せよ。
		int a=10;
		if(a==10) {
			System.out.println(a+"は10です");
		}
		//4. int型の変数bに10を代入し、bが10でない場合「bは10ではありません」と出力するプログラムを作成せよ。
		int b =10;
		if(b!=10) {
			System.out.println(b+"は10ではありません");
		}
		//5. int型の変数cに10を代入し、cが10以上の場合「cは10以上です」と出力するプログラムを作成せよ。
		int c=10;
		if(c>=10) {
			System.out.println(c+"は10以上です");
		}
		//6. int型の変数dに10を代入し、dが10未満の場合「dは10未満です」と出力するプログラムを作成せよ。
		int d=10;
		if(d<10) {
			System.out.println(d+"は10未満です");
		}
		//7. int型の変数eに10を代入し、eが10以下の場合「eは10以下です」と出力するプログラムを作成せよ。
		int e=10;
		if(e<=10) {
			System.out.println(e+"は10以下です");
		}
		//8. int型の変数fに10を代入し、fが10より大きく20以下の場合「fは10より大きく20以下です」と出力するプログラムを作成せよ。
		int f=10;
		if(f>10 && f<=20) {
			System.out.println(f+"は10より大きく20以下です");
		}
		//9. int型の変数gに10を代入し、gが10以上または20未満の場合「gは10以上または20未満です」と出力するプログラムを作成せよ。
		int g=10;
		if(g>=10 || g<20) {
			System.out.println(g+"は10以上または20未満です");
		}
		//10. String型の変数zに”Hello”を代入し、zが”Hello”である場合「zはHelloです」と出力するプログラムを作成せよ。
		String z ="Hello";
		if(z=="Hello") {
			System.out.println(z+"はHelloです");
		}

	}

}
