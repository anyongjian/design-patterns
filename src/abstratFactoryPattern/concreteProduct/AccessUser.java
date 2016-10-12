package abstratFactoryPattern.concreteProduct;

import abstratFactoryPattern.User;
import abstratFactoryPattern.abstractProduct.IUser;

public class AccessUser implements IUser {

	@Override
	public void insertUser(User user) {
		System.out.println("在Access中插入一条user记录");

	}

	@Override
	public User selectUser(int id) {
		System.out.println("根据id从Access数据库中查询一条user记录");
		return null;
	}

}
