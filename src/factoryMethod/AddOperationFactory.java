package factoryMethod;

//���幤�������������ض����͵Ĳ�Ʒ
public class AddOperationFactory implements IFactory {

	@Override
	public Operation createOperate() {
		// TODO Auto-generated method stub
		return new OperationAdd();
	}

}
