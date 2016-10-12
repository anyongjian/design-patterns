package abstratFactoryPattern.concreteProduct;

import abstratFactoryPattern.Department;
import abstratFactoryPattern.abstractProduct.IDepartment;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void insertDepartment(Department department) {
		System.out.println("在Sql Server中插入一条department记录");

	}

	@Override
	public Department selectDepartment(int id) {
		System.out.println("根据id从Sql Server数据库中查询一条Department记录");
		return null;
	}

}
