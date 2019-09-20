package testPackage;

public class Main {

	public static void main(String[] args) {
		Integer result = new Main().add(1,5);
		System.out.println(result);

		Integer result1 = new Main().multi(12,3);
		System.out.println(result1);
		
		Integer result2 = new Main().div(120,10);
		System.out.println(result2);
	}
	
	public Integer add (Integer num1, Integer num2) {
		return num1 + num2;
	}
	public Integer multi (Integer multi1, Integer multi2) {
		return multi1 * multi2;
	}
	public Integer div (Integer div1, Integer div2) {
		return div1/div2;
	}
}
