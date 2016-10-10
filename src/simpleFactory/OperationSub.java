package simpleFactory;

//具体产品角色
public class OperationSub extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
				double result = 0;
				result = numberA - numberB;
				return result;
	}

}
