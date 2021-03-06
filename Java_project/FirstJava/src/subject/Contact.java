package subject;

public class Contact {
	
	private String name;
	private String phone;
	private String email;
	private String address;
	private String group;
	private String birth;
	
	public Contact(String name, String phone, String email, String address, String group, String birth){
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.group = group;
		this.birth = birth;
	}
	
	public Contact() {
		
	}
	
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGroup() {
		return group;
	}


	public void setGroup(String group) {
		this.group = group;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public void printAll() {
		System.out.println(name);
		System.out.println(phone);
		System.out.println(email);
		System.out.println(address);
		System.out.println(group);
		System.out.println(birth);
	}

    
}
