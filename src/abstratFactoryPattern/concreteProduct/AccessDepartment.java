package abstratFactoryPattern.concreteProduct;

import abstratFactoryPattern.Department;
import abstratFactoryPattern.abstractProduct.IDepartment;

public class AccessDepartment implements IDepartment{

	@Override
	public void insertDepartment(Department department) {
		System.out.println("��Access�в���һ��department��¼");
		
	}

	@Override
	public Department selectDepartment(int id) {
		System.out.println("����id��Access���ݿ��в�ѯһ��Department��¼");
		return null;
	}
	

}
