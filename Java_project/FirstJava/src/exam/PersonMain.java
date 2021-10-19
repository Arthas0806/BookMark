package exam;



public class PersonMain {
	public static void main(String[] args) {
		//남자인 경우
		Male man = new Male();
		man.hello("최종혁", 26);
		man.man("학생", "미혼입니다.");
		//여자인 경우
		Female woman = new Female();
		woman.hello("김미영", 47);
		woman.woman("주부", " 결혼했습니다.");
	}

}
