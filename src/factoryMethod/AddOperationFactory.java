package factoryMethod;

//具体工厂，用于生产特定类型的产品
public class AddOperationFactory implements IFactory {

	@Override
	public Operation createOperate() {
		// TODO Auto-generated method stub
		return new OperationAdd();
	}

}
