package simpleFactory;

//�����࣬ͨ���������������������Ʒ��createOperateΪ��������
public class OperationFactory {

	public static Operation createOperate(String name){
		Operation operation = null;
		switch (name) {
		case "+":
			operation = new OperationAdd();
			break;
		case "-":
			operation = new OperationSub();
			break;
		case "*":
			operation = new OperationMul();
			break;
		case "/":
			operation = new OperationDiv();
			break;

		default:
			break;
		}
		return operation;
	}
}
