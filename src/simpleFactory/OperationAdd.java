package simpleFactory;

//�����Ʒ��ɫ
public class OperationAdd extends Operation{

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		double result = 0;
		result = numberA + numberB;
		return result;
	}

}
