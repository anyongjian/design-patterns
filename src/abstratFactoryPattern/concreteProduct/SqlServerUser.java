package abstratFactoryPattern.concreteProduct;

import abstratFactoryPattern.User;
import abstratFactoryPattern.abstractProduct.IUser;

public class SqlServerUser implements IUser {

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User selectUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
