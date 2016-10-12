package abstratFactoryPattern.concreteProduct;

import abstratFactoryPattern.Department;
import abstratFactoryPattern.abstractProduct.IDepartment;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void insertDepartment(Department department) {
		System.out.println("��Sql Server�в���һ��department��¼");

	}

	@Override
	public Department selectDepartment(int id) {
		System.out.println("����id��Sql Server���ݿ��в�ѯһ��Department��¼");
		return null;
	}

}
