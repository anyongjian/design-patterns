package abstratFactoryPattern;

import abstratFactoryPattern.abstractProduct.IDepartment;
import abstratFactoryPattern.abstractProduct.IUser;
import abstratFactoryPattern.concreteFactory.AccessFactory;
import abstratFactoryPattern.concreteFactory.SqlServerFactory;

/*��main�����п��Կ��������ϵͳ�����ݿ��Access�ĳ���Sql Server��ֻ��Ҫ�ı����IFactory factory = new SqlServerFactory()
 *����ط�����Ҫ�Ķ��� 
 * */
public class Client {

	public static void main(String[] args) {
		User user = new User();
		Department department = new Department();
		// TODO Auto-generated method stub
		//��Access���ݿ��в���user�Ͳ�ѯuser
		IFactory factory = new AccessFactory();
		IUser iUser = factory.createUser();
		iUser.insertUser(user);
		iUser.selectUser(1);
		//��Access���ݿ��в���department�Ͳ�ѯdepartment
		IDepartment iDepartment = factory.createDepartment();
		iDepartment.insertDepartment(department);
		iDepartment.selectDepartment(1);
		//��Sql Server���ݿ��в���user�Ͳ�ѯuser
		factory = new SqlServerFactory();
		IUser iUser2 = factory.createUser();
		iUser2.insertUser(user);;
		iUser2.selectUser(1);
		IDepartment iDepartment2 = factory.createDepartment();
		iDepartment2.insertDepartment(department);
		iDepartment2.selectDepartment(1);

	}

}
