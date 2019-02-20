package com.decorate;

/**
 * 装饰设计模型
 * 1、抽象组件：需要装饰的抽象对象(接口或抽象父类)
 * 2、具体组件：需要装饰的对象
 * 3、抽象装饰类：包含了对抽象组件的引用以及装饰着共有的方法
 * 4、具体装饰类：可以装饰的对象
 * @author Administrator
 *
 */
public class DecorateTest01 {
	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		Milk m1 = new Milk(c1);
		Suger s1 = new Suger(m1);
		Suger s2 = new Suger(c1);
		System.out.println(c1);
		System.out.println(m1);
		System.out.println(s1);
		System.out.println(s2);
	}

}
/**
 * 1、抽象组件：需要装饰的抽象对象(接口或抽象父类)
 * @author Administrator
 *
 */
interface Drink{
	double getCost();//价格
	String getInfo();//说明
	
}
/**
 * 2、具体组件：需要装饰的对象
 * @author Administrator
 *
 */
class Coffee implements Drink{
	private String name = "原味咖啡";
	private double cost = 10d;
	@Override
	public double getCost() {
		return this.cost;
	}

	@Override
	public String getInfo() {
		return this.name;
	}
	@Override
	public String toString() {
		return getInfo()+",需要消费:"+getCost();
	}

	
}
/**
 * 3、抽象装饰类：包含了对抽象组件的引用以及装饰着共有的方法
 * @author Administrator
 *
 */
abstract class Decorate implements Drink{
	private Drink drink;
	
	public Decorate(Drink drink) {
		super();
		this.drink = drink;
	}

	@Override
	public double getCost() {
		return this.drink.getCost();
	}

	@Override
	public String getInfo() {
		return this.drink.getInfo();
	}
	@Override
	public String toString() {
		return getInfo()+",需要消费:"+getCost();
	}
}
/**
 * 4、具体装饰类：可以装饰的对象
 * @author Administrator
 *
 */
class Milk extends Decorate{

	public Milk(Drink drink) {
		super(drink);
	}

	@Override
	public double getCost() {
		return super.getCost()+3d;
	}

	@Override
	public String getInfo() {
		return super.getInfo()+"加入了牛奶";
	}
	
}
/**
 * 具体装饰类：可以装饰的对象
 * @author Administrator
 *
 */
class Suger extends Decorate{

	public Suger(Drink drink) {
		super(drink);
	}

	@Override
	public double getCost() {
		return super.getCost()+2d;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo()+"加入了糖";
	}
	
}
