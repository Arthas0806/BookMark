package chapter02;

public class Member {

	// 1. String Ÿ���� �̸��� ������ �� �ִ� ���� name�� �����غ��ô�.
	// 2. int Ÿ���� ���̸� ������ �� �ִ� ���� age�� �����غ��ô�.
	// 3  double Ÿ���� Ű�� ������ �� �ִ� ���� helght�� �����غ��ô�.
	// 4. boolean Ÿ���� JAVA å�� ���� ���θ� ������ �� �ִ� ���� hasBook�� �����غ��ô�.
	// 5. �̸��� ����, Ű, å�� ���� ���θ� ����غ��ô�.
	
	// Ŭ���� ����
	//[����������] [final] Ŭ���� �̸�{}
//	{
//     ���� ����
//	   �޼ҵ� ����
//	}
	// �ν��Ͻ� ������ �ڵ� �ʱ�ȭ
	private String name; // ������� �̸��� �����ϴ� ����
	int age; // ������� ���̸� �����ϴ� ����
	double height; // ������� Ű
	boolean hasBook; // �ڹ� å ��������
	
	//ȸ���� �����͸� ����ϴ� �޼ҵ�
	void printData() {

		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("Ű: " + height);
		System.out.println("å ��������: " + hasBook);
	}
	
	public static void main(String[] args) {
		
		long juminNumber = 9701011111111L;
		
		
		// Member Ŭ������ �ν��Ͻ��� ���� -> �̸�, ����, Ű, å�������� �����Ҽ� �ִ� �޸𸮰����� ����
		Member member = new Member();
		
		// �ν��Ͻ��� ������ �����ؼ� ���
//		System.out.println("�̸�: " + member.name);
//		System.out.println("����: " + member.age);
//		System.out.println("Ű: " + member.height);
//		System.out.println("å ��������: " + member.hasBook);
		
		
		// �ν��Ͻ� ������ ���� ����
		member.name = "";
		member.age = 20;
		member.height = 185.9;
		member.hasBook = true;

		System.out.println("------------------------");
		System.out.println(" �ν��Ͻ� ������ ���� ����");
		System.out.println("------------------------");
		
//		System.out.println("�̸�: " + member.name);
//		System.out.println("����: " + member.age);
//		System.out.println("Ű: " + member.height);
//		System.out.println("å ��������: " + member.hasBook);
		
		
	}
	
}
