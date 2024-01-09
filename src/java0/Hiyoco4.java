package java0;

public class Hiyoco4 {

	public static void main(String[] args) {
		System.out.print("何月ですか？>>");
		int month = new java.util.Scanner(System.in).nextInt();
		String season ="";
		switch(month) {
		case 3:
		case 4:
		case 5:
			season = "春";
			break;
		case 6:
		case 7:
		case 8:
			season = "夏";
			break;
		case 9:
		case 10:
		case 11:
			season = "秋";
			break;
		case 12:
		case 1:
		case 2:
			season = "冬";
			break;
			
		}
		if(season.isEmpty()) {
			System.out.println("そんな月はありません");
		}else {
		System.out.println(month+"月は"+season+"です");
		}
		
	}

}
