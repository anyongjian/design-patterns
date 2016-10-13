package proxyPattern;

//Proxy类，保存一个引用使得代理可以访问实体，并重写Subject中的request方法，这样，代理就可以代替访问实体。
public class Proxy extends Subject {
	RealSubject realSubject;

	@Override
	public void request() {
		// TODO Auto-generated method stub
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.request();

	}

}
