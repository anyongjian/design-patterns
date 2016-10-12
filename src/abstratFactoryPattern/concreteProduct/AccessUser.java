package abstratFactoryPattern.concreteProduct;

import abstratFactoryPattern.User;
import abstratFactoryPattern.abstractProduct.IUser;

public class AccessUser implements IUser {

	@Override
	public void insertUser(User user) {
		System.out.println("��Access�в���һ��user��¼");

	}

	@Override
	public User selectUser(int id) {
		System.out.println("����id��Access���ݿ��в�ѯһ��user��¼");
		return null;
	}

}
