package decaratorPattern;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*װ�����ģʽ
 * ����Ҫ�����еĹ��ܽ��й�����ǿʱ�����Զ���һ���࣬
 * �����ж����룬�������еĹ��ܣ����ṩ��ǿ���ܡ���ô�Զ������Ϊװ����
 * 
 * װ����ͨ����ͨ�����췽�����ܱ�װ�εĶ��󡣡�
 * �����ڱ�װ�εĶ���Ĺ����ṩ��ǿ�Ĺ��ܡ� 
 * FileReader��û��readLine()������ֻ��һ�ζ�һ���ַ���read������
 * MyBufferReaderTest��FileReader��Ϊһ�����ԣ����ṩ��readLine()����������װ��ģʽ
   MyBufferReaderTestʵ���Ͼ����Լ�ģ���BufferedReaderlei��.
 * */
public class MyBufferReaderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fileReader = new FileReader("demo1.txt");
		MyBufferReader myBufferReader = new MyBufferReader(fileReader);
		String line = null;
		while((line=myBufferReader.readLine())!=null){
			System.out.println(line);
		}
		myBufferReader.close();

	}

}
class MyBufferReader{
	private FileReader fileReader;
	public MyBufferReader(FileReader fileReader) {
		// TODO Auto-generated constructor stub
		this.fileReader = fileReader;
	}
	public String readLine() throws IOException{
		StringBuilder stringBuilder = new StringBuilder();
		int ch = 0;
			while((ch=fileReader.read())!=-1){
				if(ch=='\r'){
					continue;
				}
				if(ch=='\n'){
					return stringBuilder.toString();
				}else{
					stringBuilder.append((char)(ch));
				}
			}
			return null;
	}
	
	public void close() throws IOException{
			fileReader.close();
	}
}
