package factoryMethod;

//�����Ʒ��ɫ
public class OperationSub extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
				double result = 0;
				result = numberA - numberB;
				return result;
	}

}