package proxyPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//通过代理访问真实对象
		Proxy proxy = new Proxy();
		proxy.request();
	}

}
