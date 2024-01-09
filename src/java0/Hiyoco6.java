package java0;

public class Hiyoco6 {

	public static void main(String[] args) {
		int count = 0;
		long paper = 1L;
		final long DIST = 384400L*1000*1000;//変わらない数字にはfinalが使える
		
		while(paper < DIST) {//while文はpaperがDISTより小さい間｛｝内の処理を継続するという意味になる
			count++;
			paper *= 2; 
			System.out.println(count+":"+paper+"mm");

		}
		System.out.println(count+"回目で月を超えました！");
	}

}
