package factoryMethod;
//抽象产品角色。定义产品的共同行为（某些实现可以被覆盖），所有具体产品必须实现该接口或抽象类
public abstract class Operation {

	public double numberA;
	public double numberB;
	
	//抽象方法，需要在子类中实现
	public abstract double getResult();
}
