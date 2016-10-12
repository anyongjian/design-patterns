package abstratFactoryPattern.concreteProduct;

import abstratFactoryPattern.Department;
import abstratFactoryPattern.abstractProduct.IDepartment;

public class AccessDepartment implements IDepartment{

	@Override
	public void insertDepartment(Department department) {
		System.out.println("在Access中插入一条department记录");
		
	}

	@Override
	public Department selectDepartment(int id) {
		System.out.println("根据id从Access数据库中查询一条Department记录");
		return null;
	}
	

}
