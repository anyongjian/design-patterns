package abstratFactoryPattern.concreteFactory;


import abstratFactoryPattern.IFactory;
import abstratFactoryPattern.abstractProduct.IDepartment;
import abstratFactoryPattern.abstractProduct.IUser;
import abstratFactoryPattern.concreteProduct.AccessDepartment;
import abstratFactoryPattern.concreteProduct.AccessUser;

public class AccessFactory implements IFactory{

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new AccessUser();
	}

	@Override
	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new AccessDepartment();
	}

}
