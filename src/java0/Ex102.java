package java0;

public class Ex102 {

	public static void main(String[] args) {
		System.out.println("start");
		int sum=0;
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			
			if(i % 7 == 0) {
				break;		
			}	
		}
	}

}

