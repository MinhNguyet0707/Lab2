
public class Student {
	private static int autoId=0;
	private int id;
	private String name;
	private String address;
	private int age;
	
	public Student( String name, String address, int age) {
		this.id = ++autoId;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	

}
