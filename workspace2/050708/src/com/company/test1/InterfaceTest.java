package com.company.test1;

public class InterfaceTest {

}

interface Fly{
	/*
	 * 常量：接口中的属性只能是常量，总是：public static final 修饰。不写也是。
	 * 方法：接口中的方法只能是：public abstract。 省略的话，也是public abstract。
	 */
	int FLY_HEIGHT = 100;//public static final
	void fly();//public abstract
	
}
interface Sail{
	int SAIL_SPEED = 100;
	void sail();
}

interface FlyAndSail extends Fly,Sail{
	void flyAndSail();
}

class Plane implements Fly{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}
class Ship implements Sail{

	@Override
	public void sail() {
		// TODO Auto-generated method stub
		
	}
	
}


class Superman implements Sail,Fly{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sail() {
		// TODO Auto-generated method stub
		
	}
	
}

class God implements FlyAndSail{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flyAndSail() {
		// TODO Auto-generated method stub
		
	}
	
}