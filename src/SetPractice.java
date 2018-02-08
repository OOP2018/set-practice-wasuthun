import java.util.*;

/**
 * Practice using a Set.
 */
public class SetPractice {
	/**
	 * Add zero or more items to the set, and print what is being added.
	 * @parameter set is the Set to add items to
	 * @parameter values zero or more Strings to add to set
	 */
	public static void addAll(Set<String> set, String ...values) {
		// add all the values to the set. 
		// print each one as you add it
		for (String string : values) {
			System.out.println(" "+string);
			set.add(string);
		}
		System.out.println();
	}
	
	/**
	 * Print all the elements in a set, using an Iterator.
	 */
	public static void print(Set<String> set) {
		// create an Iterator using set.iterator()
		// then use the iterator to print everything in the set
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {
			String next = iter.next();
			System.out.println(next);
		}
	}
	
	/**
	 * Explore behavior of a Set.
	 */
	public static void setExplorer( ) {
		// 1. Create a HashSet and add strings: dog, ant, bird, elephant, cat
			Set<String> set = new HashSet<>();
			addAll(set, "dog","ant","bird","elephant","cat");
		// 2. Print elements in the set using an Iterator over the Set.
		// You're going to need to do this again, so write a method print(Set set) to do it.
			print(set);
		
		// 3. are the elements printed in same order than you added them? 
		// What does this tell you about Sets?
			
			System.out.println("They sort every time add in set / order by string");
		// 4. Remove all the elements from the set, using a method that 
		// defined in Set (and Collection). What is the method to use?
		
			set.removeAll(set);
		// 5. Add same elements as exercise 1, but in a different order,
		// such as: "cat", "elephant", "bird", "ant", "dog"
		
			addAll(set, "cat","elephant","bird","ant","dog");
		// 6. Print the elements in the set.  Is the order same as before?
		
			print(set);
		// 7. Add duplicate elements to the set.  Add another "cat" and "dog".
			set.add(new String("cat"));
			set.add(new String("dog"));
		// To ensure that these are *distinct* objects use 'set.add(new String("cat"))'
		// and new String("dog").
			System.out.println("Add duplicate items to the set ");
		
		
		// 8. Print the elements in set.  Are there any duplicates?
		// What property of Set does this demonstrate?
			System.out.println("Set contains: ");
			print(set);
		System.out.println("===================================================================");
		// 9. Repeat the exercises using a TreeSet instead of HashSet.
		//  What is different when you use TreeSet?
			Set<String> set2 = new TreeSet<>();
			addAll(set2, "dog","ant","bird","elephant","cat");
			print(set2);
			System.out.println("They sort every time add in set / order by string");
			set2.removeAll(set2);
			addAll(set2, "cat","elephant","bird","ant","dog");
			print(set2);
			set2.add(new String("cat"));
			set2.add(new String("dog"));
			System.out.println("Add duplicate items to the set ");
			System.out.println("Set contains: ");
			print(set2);
			
		// Hint: Use Polymorphism.  Make the Set object be a *parameter* to the
		// method so you can easily use a different set just by changing the parameter!
		
		// 10. Repeat again using TreeSet with a Comparator.
			 Set<String> set3=new TreeSet<>(new Comparator<String>() {
					
					@Override
					public int compare(String o1, String o2) {
						return o1.compareToIgnoreCase(o2);
					}
				});
			 System.out.println("=============================================");
			 addAll(set3, "cat","elephant","bird","ant","dog");
			 print(set3);
			 addAll(set3, "dog","ant","bird","elephant","cat");
				print(set3);
				System.out.println("They sort every time add in set / order by string");
				set3.removeAll(set3);
				addAll(set3, "cat","elephant","bird","ant","dog");
				print(set3);
				set3.add(new String("cat"));
				set3.add(new String("dog"));
				System.out.println("Add duplicate items to the set ");
				System.out.println("Set contains: ");
				print(set3);
			
	}

	public static void main(String[] args) {
		setExplorer();
	}
}
