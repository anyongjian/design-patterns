package factoryMethod;

//���幤�������������ض����͵Ĳ�Ʒ
public class SubOperationFactory implements IFactory {

	@Override
	public Operation createOperate() {
		// TODO Auto-generated method stub
		return new OperationSub();
	}

}
