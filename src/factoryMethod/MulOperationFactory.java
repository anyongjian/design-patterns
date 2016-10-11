package factoryMethod;

public class MulOperationFactory implements IFactory {

	@Override
	public Operation createOperate() {
		// TODO Auto-generated method stub
		return new OperationMul();
	}

}
