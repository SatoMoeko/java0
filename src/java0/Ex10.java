package java0;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("start");
		int sum=0;
		int i = 0;
		for (; i<=10; i++) {//for文のなかの変数は基本iを使う
			sum = sum+i;//for文のなかの変数iはfor文の中でしか使えない
		}
		System.out.println(i);
	}

}
