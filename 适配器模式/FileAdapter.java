package test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;



public class FileAdapter {
	public static Reader Adapter(InputStream is) throws Exception {
		return new InputStreamReader(is, "UTF-8");
	}
	public static void main(String[] args) throws Exception {
		//����ӿ�
		InputStream inputStream = new FileInputStream("abc.txt");
		//Ŀ��ӿ�
		Reader reader = FileAdapter.Adapter(inputStream);
		//������ģʽ��������Ľӿ�ת��Ϊָ���Ľӿڣ���Ŀ��ӿڵķ����ܹ�ʵ��
	}
}
