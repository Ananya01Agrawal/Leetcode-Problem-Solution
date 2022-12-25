class Solution {
	public int[] answerQueries(int[] nums, int[] queries) {
		int N = nums.length; 
		int M = queries.length;

		Arrays.sort(nums);

		int[] ansArr = new int[M];
		int[] prefix = new int[N];

		prefix[0] = nums[0];

		for(int i=1; i<N; i++) {
			prefix[i] = prefix[i-1] + nums[i];
		}

		for(int i=0; i<M; i++) {
			int idx = -1;

			for(int j=0; j<N; j++) {
				if(prefix[j] <= queries[i]) {
					idx = j;
				} else {
					break;
				}
			}

			ansArr[i] = idx+1;
		}

		return ansArr;
	}
}
