package factoryMethod;

//��������ģʽ��һ���������ɫ���ͻ��ˣ����󹤳������幤���������Ʒ�������Ʒ��
//���ڿͻ��ˣ���Ҫ�õ�ĳһ������Ʒ������Ҫ�õ�һ�����幤����ͨ���ù���������
//��Ʒ������ȡĳһ���͵ľ����Ʒ��
//���еľ��幤��������ʵ�ֳ��󹤳�������ϵͳ����Ҫ���һ���µĲ�Ʒ��ʱ��ֻ��Ҫʵ��
//һ�����Ĳ�Ʒ����������������Ͳ�Ʒ��ľ��幤�����ɣ������˼򵥹���������һ���Ʒʱ��
//�����޸Ĺ�����ı׶ˣ�ԭ�򣺶���չ���ţ����޸Ĺرգ���

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory factory = new AddOperationFactory();
		Operation operation = factory.createOperate();
		operation.numberA = 4;
		operation.numberB = 2;
		double result = operation.getResult();
		System.out.println("result:"+result);
	}

}
