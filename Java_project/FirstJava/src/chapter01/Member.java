package chapter01;

public class Member {

	// 2. Member Ŭ������ �����ϰ�.
	// ���� �޼ҵ带 ����� �ڱ� �ڽ��� �̸��� ����ϴ� �޼ҵ带 ����� ���ô�.
	public static void main(String[] args) {
		// static : ����Ʈ �ڵ尡 ����ӽſ��� �����ϴ� ������ �޼ҵ� �ڵ尡 �޸𸮿� �ε�ȴ�.
		System.out.println("������");
		// System Ŭ���� / out �������� / println �޼ҵ�
		System.out.println("�޼ҵ� ȣ��");
		sayName();
	}
	
	// �̸��� ����ϴ� �޼ҵ�
	// ��ȯŸ�� �޼ҵ� �̸�(�Ű�����, ...)
	
	static void sayName() {
		System.out.println("������");
	}
	
	// �ν��Ͻ�ȭ �Ǳ����̶� ȣ���� �Ұ����ؼ� ������ ����.
}
