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
		//输入接口
		InputStream inputStream = new FileInputStream("abc.txt");
		//目标接口
		Reader reader = FileAdapter.Adapter(inputStream);
		//适配器模式，将输入的接口转换为指定的接口，是目标接口的方法能够实现
	}
}
