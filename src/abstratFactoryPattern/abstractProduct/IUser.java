package abstratFactoryPattern.abstractProduct;

import abstratFactoryPattern.User;

//���ڶ�User������ɾ��ĵĳ���ӿڣ����������������࣬������Sql Server�ĺ�Access��
//���ڿͻ��˷��ʣ���������ݿ���ʵĽ����
public interface IUser {

	public void insertUser(User user);
	public User selectUser(int id);
}
