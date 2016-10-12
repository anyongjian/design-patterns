package abstratFactoryPattern;
//抽象工厂，所有的具体工厂类必须实现此接口

import abstratFactoryPattern.abstractProduct.IDepartment;
import abstratFactoryPattern.abstractProduct.IUser;

public interface IFactory {
	public IUser createUser();
	public IDepartment createDepartment();
}
