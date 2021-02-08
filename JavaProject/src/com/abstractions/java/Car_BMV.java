package com.abstractions.java;

public class  Car_BMV extends Base_Car  implements Parts,Parts2 

/*multiple interfaces can be implemented  but only one abstract class can be inherited */
{

	public static void main(String[] args) {

		//It should implement all the methods in the interfaces
		// TODO Auto-generated method stub

		Base_Car cars= new Car_BMV();
		//cannot create object for abstract classes and interfaces
		//object creation for abstract class and call methods which are not abstract
		Parts Obj1 = new Car_BMV();
		
		cars.vehicle();
		cars.engine_type();
		cars.car_type();
		
		Obj1.method2(); //called from interface
		// cars.partsOfCar(); no object creation nor calling method is required if they are from abstract and if it is not needed here
		
		System.out.println(value);
		System.out.println(extraparts);


	}

	@Override
	public void engine_type() //abstract methods should be implemented

	{
		System.out.println("i am BMV engine type");

	}

	@Override
	public String method1() {

		return value;


	}

	@Override
	public void method2() {
		System.out.println(value2);
	}

	@Override
	public String method3() {
		// TODO Auto-generated method stub

		return extraparts;

	}



}
