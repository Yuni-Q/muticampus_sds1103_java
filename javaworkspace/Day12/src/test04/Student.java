package test04;

public class Student {
	private String name;	// �̸�
	private String phone;	// �޴�����ȣ
	private int age;		// ����
	private String address;	// �ּ�
/////////////////////////////////////////////////////////////
	public Student(String name, String phone, int age, String address) {
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.address = address;
	}
///////////////////////////////////////////////////////////////	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", age=" + age + ", address=" + address + "]";
	}	
}
