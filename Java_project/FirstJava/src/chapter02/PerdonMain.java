package chapter02;

public class PerdonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Person Ŭ������ �ν��Ͻ� ����
		Person p = new Person();
		
//		p.memberName = "������";
		p.setMemberName("������");
		p.setPhoneNumber("010 - 7777 - 7777");
		p.setJuminNumber(9912121111111L);
		
		System.out.println("�̸�: " + p.getMemberName());
		System.out.println("��ȭ��ȣ: " + p.getPhoneNumber());
		System.out.println("�ֹι�ȣ: " + p.getJuminNumber());
		
		
		System.out.println("-------------------------");
		p.printData();
	}

}
