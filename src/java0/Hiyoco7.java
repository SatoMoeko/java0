package java0;

public class Hiyoco7 {

	public static void main(String[] args) {
		
		for(int i=1; i<=20; i++) {
			if(i %3 ==0 && i %5 ==0) {
				System.out.println("FIZZBUZZ");
			}else if(i %5 ==0) {//else（でなければ）をつかわないと数字も表記されてしまうので注意
				System.out.println("BUZZ");
			}else if(i %3 ==0) {
				System.out.println("FIZZ");
			}else {
			System.out.println(i);
			}
		}

	}

}
