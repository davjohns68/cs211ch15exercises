package cs211ch15exercises;

//import java.util.*;


public class Test {

// Testing for Exercises in back of Chapter 15
	
	public static void main(String[] args) {
		ArrayIntList test = new ArrayIntList();		// my data structure
                ArrayIntList testEmpty = new ArrayIntList();
                ArrayIntList testSorted = new ArrayIntList();
		int[] a = {2,9,6,1,3,9,3};					// sample data
		for (int i: a) test.add(i);					// use for each 
                int[] b = {1,3,4,7,7,7,9,9,1,13,14,14,14,16,16,18,19,19,19,19};
                for (int i: b) testSorted.add(i);
		

		try {
			ArrayIntList oops = new ArrayIntList(-9);	// maybe illegal???
			System.out.println(oops);
		} catch (Exception e) {
			System.out.println("Caught  " ); //+ e.toString());
		} finally {
			System.out.println("Always do this stuff");
		}
		
		System.out.println(test);
		
		//test.replaceAll(9, 999);						// Exercise 15.3
		//test.runningTotal();							// Exercise 15.5 (wrong use)
		ArrayIntList test2 = test.runningTotal();					// (correct use)
		//test = ArrayIntList.runningTotal(test);		// (static use)
		//test = Utility.runningTotal(test);			// (another static use)
		System.out.println(test2.isPairwiseSorted());	// Exercise 15.7
		//test.removeAll(999);								// 15.13
		//test.mirror();									// 15.15
		//test.stretch(3);									// 15.17
		System.out.println(test2);
                System.out.println(testEmpty.runningTotal());
                test2.fill(3);
                System.out.println(test2);
                System.out.println(test2.isPairwiseSorted());
                System.out.println(test.count(5));
                System.out.println(test2.count(3));
                System.out.println(testSorted.maxCount());
                System.out.println(testSorted.longestSortedSequence());
		
//		for (int i: test) System.out.println(i);	// nor Iterable nor Iterator??
//		ArrayIntListIterator itr = new ArrayIntListIterator(test);
//		while (itr.hasNext()) System.out.print(itr.next()+", ");
//		System.out.println();
		
		// Programming Project #2
//		ArrayList<Integer> test2 = new ArrayList<Integer>();
//		for (int i: a) test2.add(i);
//		for (Integer I: test2) System.out.print(I+", "); // uses a generic Java API Iterator<E>
//		System.out.println();
//		ArrayListIterator<Integer> itr2 = new ArrayListIterator<Integer>(test2);
//		while (itr2.hasNext()) System.out.print(itr2.next()+", ");
		
	}

}