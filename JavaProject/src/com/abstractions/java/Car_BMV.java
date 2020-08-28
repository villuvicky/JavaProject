package com.abstractions.java;

public class  Car_BMV extends Base_Car  implements Parts,Parts2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base_Car cars= new Car_BMV();
		cars.vehicle();
		cars.engine_type();
		cars.car_type();
		System.out.println(value);
		System.out.println(extraparts);


	}

	@Override
	public void engine_type() {
		System.out.println("i am BMV engine type");

	}

	@Override
	public void car_type() {
		// TODO Auto-generated method stub
		System.out.println("I am SUV from BMW");
	}

	@Override
	public String method1() {

		return value;


	}

	@Override
	public String method2() {
		return value;

	}

	@Override
	public String method3() {
		// TODO Auto-generated method stub

		return extraparts;

	}



}
