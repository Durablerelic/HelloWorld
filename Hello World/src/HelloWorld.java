
public class HelloWorld {

	public static int counter = 0;	
	
	public static void main(String[] args) {	
		if(counter == 0) {
		for(int i = 0; i < 60; i++) {
			counter++;
			}
		}
		rng();
	}

	public static void rng() {
		if(counter >= 60) {
		double x = Math.random() * 10;
		System.out.println((int)x);
		counter = 0;
		}
		
	}
	
}


	