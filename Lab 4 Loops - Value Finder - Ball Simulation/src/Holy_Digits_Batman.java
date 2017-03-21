
public class Holy_Digits_Batman {

	public static void main(String[] args) {
		
		for(int num = 0; num < 10000; num++){
			int a = (num % 10000) / 1000;
			int b = (num % 1000) / 100;
			int c = (num % 100) / 10;
			int d = (num % 10) / 1;
			if(num % 2 == 1){
				if (a + b + c + d == 27){
					if(a == (c * 3)){
						if(a != b && a != c && a != d && b != c && b != d && c != d){ //conditions
							System.out.println(num);
						}
					}
				}
			}
		}

	}
}
