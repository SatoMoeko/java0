package java0;

public class Hiyoco52 {

	public static void main(String[] args) {
		int count = 0;
		while(true) {//while(true)は無限に繰り返すという意味
			count++;
			int no = new java.util.Random().nextInt(889)+111;
			System.out.println(no);
			if(no == 777) {
				break;
			}
		}
		System.out.println(count+"回目に777がでました！");

	}

}
