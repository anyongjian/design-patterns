package proxyPattern;

//Proxy�࣬����һ������ʹ�ô�����Է���ʵ�壬����дSubject�е�request����������������Ϳ��Դ������ʵ�塣
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
