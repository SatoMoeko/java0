package java0;

public class Ex6 {

	public static void main(String[] args) {
		int score = 72;
		if(score > 80) {//上から判定されていくので順番を間違えない
			System.out.println("優");
		}else if(score > 60) {
			System.out.println("良");
		}else if(score > 40) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
		int height = 170;
		double eye = 0.7;
		//ネスト（入れ子）したif文
		if(height >= 165) {//(height >= 165 && eye>= 1.0) でもOK
			if(eye >= 1.0) {
				System.out.println("ok");
			}
		}

	}

}
