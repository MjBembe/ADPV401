public class Calculator20180301{
	public static double add(double x1, double x2){
		return x1+x2;
	}
	public static double sub(double x1, double x2){
		return x1-x2;
	}
	public static double div(double x1, double x2){
		return x1/x2;
	}
	public static double mult(double x1, double x2){
		return x1*x2;
	}
	public static void main(String[] args){
		double num1;
		double num2;
		num1=3;
		num2=4;
		System.out.println("The difference between "+num1+" and "+num2+" is " +sub(num1,num2));
		System.out.println("The quotient between "+num1+" and "+num2+" is " +div(num1,num2));
		System.out.println("The product between "+num1+" and "+num2+" is " +mult(num1,num2));
		System.out.println("The sum between "+num1+" and "+num2+" is " +add(num1,num2));

	}

}