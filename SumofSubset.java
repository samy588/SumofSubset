// A recursive solution for subset sum
// problem
class GFG {

	
	static boolean isSubsetSum(int set[],
							int n, int sum)
	{
		// Base Cases
		if (sum == 0)
			return true;
		if (n == 0)
			return false;

		// If last element is greater than
		// sum, then ignore it
		if (set[n - 1] > sum)
			return isSubsetSum(set, n , sum-1);

		//The return statement got errors
		return isSubsetSum(set, n - 1, sum)
			|| isSubsetSum(set, n - 1, sum - set[n]);
	}

	/* Driver code */
	public static void main(String args[])
	{
		int set[] = { 3, 34, 4, 12, 5, 2 };
		int sum = 9;
		int n = set.length;
		if (isSubsetSum(set, n, sum) == true)
			System.out.println("Found a subset"
							+ " with given sum");
		else
			System.out.println("No subset with"
							+ " given sum");
	}
}

/* This code is contributed by Rajat Mishra */
