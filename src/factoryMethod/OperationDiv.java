package factoryMethod;

//具体产品角色
public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		try{
			if(numberB == 0){
				throw new Exception("除数不能为零");
			}else{
				return numberA/numberB;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return 0;
	}

}
