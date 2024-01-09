package java0;

public class Ex13 {

	public static void main(String[] args) {
		int isHungry =1;
		String food ="りんご";
		System.out.println("こんにちは");
		System.out.println(isHungry ==0 ? "お腹がいっぱいです" : "はらぺこです");
		if(isHungry ==1) {
			System.out.println(food+"をいただきます");
		}
		System.out.println("ごちそうさまでした");
	}

}


