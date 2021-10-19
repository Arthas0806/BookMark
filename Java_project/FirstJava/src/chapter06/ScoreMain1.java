package chapter06;

public class ScoreMain1 {
	public static void main(String[] args) {
		ScoreManager manager = new ScoreManager(); // 10개 저장공간
		
		// 1.데이터 저장
		manager.insertScore(new Student("손흥민", 100, 100, 100));
		manager.insertScore(new Student("king", 90, 80, 70));
		manager.insertScore(new Student("SCOTT", 78, 60, 69));
		
//		// 2. 데이터 전체 출력
//		manager.showAllData();
//		
//		// 3. 데이터 검색
//		manager.searchData(/*"손흥민"*/);
//		manager.searchData(/*"이강인"*/);
//		
//		// 4. 데이터 삭제
//		manager.deleteScore(/*"SCOTT"*/);
//		manager.deleteScore(/*"이강인"*/);
//		
//		// 5. 데이터 검색 또는 전체 데이터 출력
//		manager.showAllData();
	}
}
