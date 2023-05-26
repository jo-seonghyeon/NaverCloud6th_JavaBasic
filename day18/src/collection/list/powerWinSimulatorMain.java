package collection.list;

import java.util.List;

public class powerWinSimulatorMain {
	
	public static void main(String[] args) {
		
		powerWinSimulatorGoodCase ls = new powerWinSimulatorGoodCase();
		
		List<Integer> powerWinNumbers = ls.getpowerNumbers();
		List<Integer> powerGetNumbers = ls.getpowerNumbers();
		
		ls.tryWinLoop(powerWinNumbers, powerGetNumbers);
		
		System.out.println("반복 횟수: " + ls.getCount());
		
	}
}
