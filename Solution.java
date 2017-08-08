class Solution{
	public static void main(String[] args){
		//call function and test here
		//pass in data
		//the "weight" is the index in this case, but will not assume and make it general by using another array. 
		//items are already sorted
		int[] amount = {1,2,3,4,5,6,7,8,9,10};
		int[] price = {1,5,8,9,10,17,17,20,24,30};
		int n = 20;
		System.out.println(maxProfit(price, amount, n)); // 60 or 56
		System.out.println(maxProfit(price,amount, 2));
		System.out.println(maxProfit(price,amount, 0));
		System.out.println(maxProfit(price,amount, 12));
		System.out.println(maxProfit(price,amount, 6));
		
	}
	//function to solve problem
	public static int maxProfit(int[] price, int[] amount, int n){
		int[][] dp = new int[price.length  + 1][n + 1];
		for(int r = 1; r < dp.length; ++r){
			for(int c = 1; c < dp[0].length; ++c){
				if(amount[r - 1] <= c){
					dp[r][c] = Math.max(price[r - 1] + dp[r - 1][c - amount[r - 1]] , dp[r - 1][c]);
				}
				else{
					dp[r][c] =  dp[r - 1][c];
				}
			}
		}
		//max(do pick + then one that is remaining, then best what you cdo so far(look up) )

		return dp[price.length][n];
	}
	/*
	//function to solve problem
	public static int maxProfit(int[] price, int[] amount, int n){
		int[] dp = new int[n + 1];
		for(int r = 0; r <= n; ++r){
			for(int c = 0; c < price.length; ++c){
				if(amount[c] <= r){
					dp[r] = Math.max(price[c]+ dp[r - amount[c]] , dp[r]);
				}
			}
		}
		//max(do pick + then one that is remaining, then best what you cdo so far(look up) )

		return dp[n];
	}
	*/
}
