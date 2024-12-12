	public static int find(int[] array, int value) {
		// int = 1;
		// while (i < array.length);
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) 
				return i;
			}
		return -1;
	}

worst: declare int = 1 and attempt to enter loop, but do not go forward since it is empty: 2

find best: at position 0, declare int = 1, enter the loop since true, and return so one
    additional conditional check: 3

find worst: look at every index position repeats n times (3)
    2 + 3n

find expected: 2 + ( n/2 )(3), half the time it is found half the time it is not

    
	/**
	 * Replace all occurrences of oldValue with newValue in array.
	 * @param array ints where oldValue may be found
	 * @param oldValue value to replace
	 * @param newValue new value
	 */
	public static void replaceAll(int[] array, int oldValue, int newValue) {
		int index = find(array, oldValue);
		while (index > -1) {
			array[index] = newValue; 
			index = find(array, oldValue);
		}
	}

empty: call to find, was already two and assign to index is a statement.
    check while condition, one statement, and since it is false we do not enter
    4

find best: find worst is necessary, which was 2 + 3n, index assing: 1, while loop: 1
    4 + 3n

find worst: take the best case scenario for find, index assign: 1, while loop: 1, n times
    replacement: 1, assing index to new value: 1, call find again (n)^2, check condition again: 1
    ((3n^2)/2) + 4n + 4