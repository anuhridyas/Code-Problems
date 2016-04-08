package com.company;

/**
 * Created by jiteshnambiar on 4/7/16.
 */
public class CoinChange {

    public static  void coinChangeSet(int[] coins,int amount) {
        int[][] coinChange = new int[coins.length + 1][amount + 1];
        for (int i = 0; i < coinChange[0].length; i++) {
            coinChange[0][i] = 0;
        }
        for(int i=0;i<coinChange.length;i++){
            coinChange[i][0]=1;
        }

        for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){

                if(  j>=coins[i-1] ){
                    coinChange[i][j]=coinChange[i-1][j]+coinChange[i][j-coins[i-1]];
                }
                else if(j<coins[i-1] ){
                    coinChange[i][j]=coinChange[i-1][j];
                }
            }
        }
     System.out.println(coinChange[coins.length][amount]);

    }

    public static  void main(String[] args){
        int amount=15;
        int[] coins={5,2,3};
        coinChangeSet(coins,amount);
    }
}
