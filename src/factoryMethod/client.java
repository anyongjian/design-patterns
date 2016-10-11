package factoryMethod;

//工厂方法模式，一共有五个角色，客户端，抽象工厂，具体工厂，抽象产品，具体产品。
//对于客户端，想要得到某一款具体产品，首先要得到一个具体工厂，通过该工厂的生产
//产品方法获取某一类型的具体产品。
//所有的具体工厂都必须实现抽象工厂，这样系统在需要添加一款新的产品的时候，只需要实现
//一款具体的产品类和用于生产该类型产品类的具体工厂即可，避免了简单工厂中增加一款产品时，
//必须修改工厂类的弊端（原则：对扩展开放，对修改关闭）。

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory factory = new AddOperationFactory();
		Operation operation = factory.createOperate();
		operation.numberA = 4;
		operation.numberB = 2;
		double result = operation.getResult();
		System.out.println("result:"+result);
	}

}
