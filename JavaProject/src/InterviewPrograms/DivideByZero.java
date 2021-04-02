package InterviewPrograms;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//infinity when u divide any other data type except integer
		System.out.println(1.0/0); //float
		System.out.println(1.2d/0);// double value
		System.out.println(12.2/0.0);
		System.out.println(0.0/0.0);//NaN will be printed
		System.out.println(0/0.0);//NaN will be printed
		System.out.println(1/0); //arithmetic exception will be thrown
	}

}
