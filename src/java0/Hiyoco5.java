package java0;

public class Hiyoco5 {

	public static void main(String[] args) {
		int count = 0;
		int no = 0;
		while(no != 777) {
			count++;
			no = new java.util.Random().nextInt(889)+111;
			System.out.println(no);
		}
		System.out.println(count+"回目に777がでました！");
	}

}
