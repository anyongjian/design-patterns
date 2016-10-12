package abstratFactoryPattern;

import abstratFactoryPattern.abstractProduct.IDepartment;
import abstratFactoryPattern.abstractProduct.IUser;
import abstratFactoryPattern.concreteFactory.AccessFactory;
import abstratFactoryPattern.concreteFactory.SqlServerFactory;

/*在main方法中可以看到，如果系统的数据库从Access改成了Sql Server，只需要改变的是IFactory factory = new SqlServerFactory()
 *其余地方不需要改动。 
 * */
public class Client {

	public static void main(String[] args) {
		User user = new User();
		Department department = new Department();
		// TODO Auto-generated method stub
		//从Access数据库中插入user和查询user
		IFactory factory = new AccessFactory();
		IUser iUser = factory.createUser();
		iUser.insertUser(user);
		iUser.selectUser(1);
		//从Access数据库中插入department和查询department
		IDepartment iDepartment = factory.createDepartment();
		iDepartment.insertDepartment(department);
		iDepartment.selectDepartment(1);
		//从Sql Server数据库中插入user和查询user
		factory = new SqlServerFactory();
		IUser iUser2 = factory.createUser();
		iUser2.insertUser(user);;
		iUser2.selectUser(1);
		IDepartment iDepartment2 = factory.createDepartment();
		iDepartment2.insertDepartment(department);
		iDepartment2.selectDepartment(1);

	}

}
