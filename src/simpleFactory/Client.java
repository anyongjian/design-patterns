package simpleFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation operation = OperationFactory.createOperate("/");
		operation.numberA = 4;
		operation.numberB = 2;
		double result = operation.getResult();
		System.out.println("result:"+result);
		
	}

}
