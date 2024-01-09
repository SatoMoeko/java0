package java0;

public class Kugat {

	public static void main(String[] args) {
		System.out.print("９月は英語で何？>>");
		String ans = new java.util.Scanner(System.in).next();//ひと単語ならnextLineでなくnextでもOK
		if (ans.equals("september")|| ans.equals("September")) {//縦棒２本（||）で「または」という意味
			//↑if (ans,equalsIgnoreCase("september"))という表記にすれば大文字小文字かかわらず受け取れる
			System.out.println("正解！!");
		}else {
			System.out.println("残念！");
		}

	}

}
