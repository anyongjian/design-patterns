package abstratFactoryPattern;
//���󹤳������еľ��幤�������ʵ�ִ˽ӿ�

import abstratFactoryPattern.abstractProduct.IDepartment;
import abstratFactoryPattern.abstractProduct.IUser;

public interface IFactory {
	public IUser createUser();
	public IDepartment createDepartment();
}
