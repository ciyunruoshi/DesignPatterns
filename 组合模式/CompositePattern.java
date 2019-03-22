package test;

import java.util.ArrayList;
import java.util.List;

abstract class File{
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display() {}
	
}


class Txt extends File{
	public void display() {
		System.out.println("txt нд╪Ч");
	}
}
class Folder extends File{
	List<File> list;
	public Folder() {
		super();
		list = new ArrayList<>();
	}
	
	public void add(File a) {
		list.add(a);
	}
	
	public void display() {
		for(File f:list) {
			f.display();
		}
	}
}
public class CompositePattern {
	public static void main(String[] args) {
		Folder tFolder = new Folder();
		File atxt = new Txt();
		Folder cFolder = new Folder();
		tFolder.add(atxt);
		tFolder.add(cFolder);
	}
}
