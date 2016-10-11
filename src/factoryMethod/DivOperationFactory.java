package factoryMethod;

public class DivOperationFactory implements IFactory {

	@Override
	public Operation createOperate() {
		// TODO Auto-generated method stub
		return new OperationDiv();
	}

}
