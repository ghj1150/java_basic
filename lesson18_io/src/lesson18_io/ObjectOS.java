package lesson18_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectOS {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		List<String> list = new ArrayList<String>(Arrays.asList("가", "나", "다"));
		
		List<Member> members = new ArrayList<Member>(Arrays.asList(new Member("홍길동", 40), new Member("김길동", 20)));
		System.out.println(members); // age yes

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
		oos.writeObject(members);
//		oos.writeObject(list);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
//		System.out.println(ois.readObject());
//		System.out.println(ois.readObject());
		
		List<Member> result = (List<Member>) ois.readObject();
		result.forEach(System.out::println); // age no
	}
}

class Member implements Serializable {
	String name;
	transient int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

}
