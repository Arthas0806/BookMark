package chapter02;

public class Person {

//	2. Person Ŭ������ ����� ����, �Ʒ��� ȸ�� ������ �����ϴ� �������� �����غ��ô�. 
//	�����̸��� �ۼ��ϴ� ��Ģ�� �°� ���� ���� �̸��� ������ ������. 
//	�� ȸ���̸��� �����ϴ� ����
//	�� ȸ�� ��ȭ��ȣ ( 000-0000-0000 )�� �����ϴ� ����
//	�� ȸ�� �ֹε�Ϲ�ȣ ( 000000-0000000 �Ǵ� 0000000000000 )�� �����ϴ� ����
	
	//private : Ŭ���� ���ο��� ����鸸 ������ �����ϵ��� �ϴ� ���� ������
	
	private String memberName; // ȸ���� �̸�
	private String phoneNumber; // ��ȭ��ȣ
//	private String juminNumber; // �ֹε�Ϲ�ȣ
	private long juminNumber;
	
	// setter / getter
	// setter => ���� �޾Ƽ� ������ ����
	
	// setter => ���� �޾Ƽ� ������ ����
	public void setMemberName(String name) {
		memberName = name;
	}
	// getter=> �ν��Ͻ� ������ ��ȯ
	public String getMemberName() {
		return memberName;
	}
	
	public void setPhoneNumber(String number) {
		phoneNumber = number;
	}
	// getter=> �ν��Ͻ� ������ ��ȯ
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setJuminNumber(long number) {
		juminNumber = number;
	}
	// getter=> �ν��Ͻ� ������ ��ȯ
	public long getJuminNumber() {
		return juminNumber;
	}
	
	public void printData() {
		System.out.println("�̸�: " + memberName);
		System.out.println("��ȭ: " + phoneNumber);
		System.out.println("�ֹι�ȣ: " + juminNumber);
	}

}
