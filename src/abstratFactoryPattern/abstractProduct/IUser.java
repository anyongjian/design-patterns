package abstratFactoryPattern.abstractProduct;

import abstratFactoryPattern.User;

//用于对User对象增删查改的抽象接口，可以派生多种子类，如用于Sql Server的和Access的
//用于客户端访问，解除与数据库访问的紧耦合
public interface IUser {

	public void insertUser(User user);
	public User selectUser(int id);
}
