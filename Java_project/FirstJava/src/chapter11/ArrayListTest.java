package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
<<<<<<< HEAD
=======

>>>>>>> ca7705290f4260cdbb4c79914f0e3e7ef7f40392
	public static void main(String[] args) {
		
		ArrayList<Integer> list = null;
		
<<<<<<< HEAD
		//
=======
		//list = new ArrayList<Integer>();
>>>>>>> ca7705290f4260cdbb4c79914f0e3e7ef7f40392
		list = new ArrayList<>();
		
		List<Integer> list2 = new ArrayList<Integer>();
		
<<<<<<< HEAD
=======
		
>>>>>>> ca7705290f4260cdbb4c79914f0e3e7ef7f40392
		// 데이터(인스턴스) 저장 : add(E e)
		list.add(new Integer(1));
		list.add(10); // new Integer(10) Auto Boxing
		list.add(13);
		list.add(5);
		list.add(1);
		
<<<<<<< HEAD
		// 리스트의 요소의 개수
=======
		// 리스트의 요소의 개수 
>>>>>>> ca7705290f4260cdbb4c79914f0e3e7ef7f40392
		int size = list.size();
		System.out.println("요소의 개수 : " + size);
		
		// for 이용 일괄 참조
<<<<<<< HEAD
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------------------");
=======
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------------");
>>>>>>> ca7705290f4260cdbb4c79914f0e3e7ef7f40392
		
		// for each
		for(Integer i : list) {
			System.out.println(i);
		}
		
<<<<<<< HEAD
		System.out.println("---------------------------");
		
		//정렬자를 이용한 전체 출력
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			Integer i = itr.next();
=======
		System.out.println("----------------------");
		
		// 정렬자를 이용한 전체 출력
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			Integer i = itr.next(); 
>>>>>>> ca7705290f4260cdbb4c79914f0e3e7ef7f40392
			System.out.println(i);
		}
		
		// 요소 삭제
<<<<<<< HEAD
		list.remove(3);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
=======
		list.remove(2);
		 
		System.out.println("2번지 요소 삭제");
		System.out.println("-------------------------");
		
		// for each
		for(Integer i : list) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		

	}

>>>>>>> ca7705290f4260cdbb4c79914f0e3e7ef7f40392
}
