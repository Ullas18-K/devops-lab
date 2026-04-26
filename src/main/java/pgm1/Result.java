package pgm1;

public class Result {
	public static String display(int m) {
		if (m>20) 
			return "pass";
		else if(m<=20 && m>0)
			return "fail";
		else 
			return "invalid";
	}
	public static void main(String[] args) {
		System.out.println(display(44));
	}

}
