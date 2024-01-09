package java0;

public class Ex1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		//a = a+5;
		a +=5;
		a -=3;
		a *=2;
		a /=3;
		//整数割る整数のとき割り切れないと商のみを表示する（少数があるときは少数まで）
		a %=3;
		//%は割算したときの余りを表示する演算子
		System.out.println(a);
		
		/*以下例文
		 * 2000円もってて180円のリンゴはいくつ買えますか？
		int money = 2000;
		int apple = 180; 
		int sho = money / apple;
		int amari = money % apple;
		System.out.println(sho+"個買えて"+amari+"円余ります");
		これをまとめて簡潔にかくと以下になる*/
		int money = 2000;
		int apple = 180;
		System.out.println(money/apple+"個買えて"+money % apple+"円余ります");
		
		
		
	
	}

}
