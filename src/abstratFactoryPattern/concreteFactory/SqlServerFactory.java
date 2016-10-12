package abstratFactoryPattern.concreteFactory;

import abstratFactoryPattern.IFactory;
import abstratFactoryPattern.abstractProduct.IDepartment;
import abstratFactoryPattern.abstractProduct.IUser;
import abstratFactoryPattern.concreteProduct.SqlServerDepartment;
import abstratFactoryPattern.concreteProduct.SqlServerUser;

public class SqlServerFactory implements IFactory {

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new SqlServerUser();
	}

	@Override
	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new SqlServerDepartment();
	}

}
