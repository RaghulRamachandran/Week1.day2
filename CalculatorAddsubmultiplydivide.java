package Week1.day2Assignments;

public class CalculatorAddsubmultiplydivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();

		int addNumbers = obj.addNumbers(3, 5, 8);
		System.out.println("Addition of given Numbers = " + addNumbers);

		int subNumbers = obj.subNumbers(30, 20);
		System.out.println("Subraction of given Numbers = " + subNumbers);

		double multiplyNumbers = obj.multiplyNumbers(9, 9);
		System.out.println("Multiplication of given Numbers = " + multiplyNumbers);

		float divideNumbers = obj.divideNumbers(35, 3);
		System.out.println("Division(quotient) of given Numbers = " + divideNumbers);

		float divRemainderNumbers = obj.divRemainderNumbers(35, 3);
		System.out.println("Division(Remainder) of given Numbers = " + divRemainderNumbers);

	}
}

	


