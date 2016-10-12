package abstratFactoryPattern.abstractProduct;

import abstratFactoryPattern.Department;

public interface IDepartment {
	public void insertDepartment(Department department);
	public Department selectDepartment(int id);
}
