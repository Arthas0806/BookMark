package chapter11;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// 저장
		map.put(1, "AAA");
		map.put(5, "BBB");
		map.put(3, "CCC");
		map.put(2, "DDD");
		map.put(4, "EEE");
		
		
		NavigableSet<Integer> navi = map.navigableKeySet();
		
		System.out.println("key 값의 오름 차순 출력");
		Iterator<Integer> itr = navi.iterator();
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}
		
		System.out.println("key값의 내림 차순 출력");
		itr = navi.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}
		
	}
	
	
}
