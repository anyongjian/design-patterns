package factoryMethod;

//�����Ʒ��ɫ
public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		try{
			if(numberB == 0){
				throw new Exception("��������Ϊ��");
			}else{
				return numberA/numberB;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return 0;
	}

}
