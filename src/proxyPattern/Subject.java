package proxyPattern;

//Subject类，定义了RealSubject和Proxy的共用接口，这样在任何使用RealSubject的地方都可以使用Proxy.
public abstract class Subject {
	public  abstract void request(); 
}
