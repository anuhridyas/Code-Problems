package com.company;

/**
 * Created by jiteshnambiar on 3/30/16.
 */
public class MaximumSizeSquareSubmatrixWithAllOnes {
    public static  int  findMaxSizeSquare(int[][] matrix){
        int maxSize=0;
        int[][] table=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0 || j==0){
                    table[i][j]=matrix[i][j];
                    maxSize = table[i][j] > maxSize ? table[i][j] : maxSize;
                }
                else if(matrix[i][j]==0){
                    table[i][j]=0;
                }
                else {

                    table[i][j] = minimum(table[i - 1][j - 1], table[i - 1][j], table[i][j - 1])+1;
                    maxSize = table[i][j] > maxSize ? table[i][j] : maxSize;
                }
            }
        }
        return(maxSize);

    }

    private static  int  minimum (int a ,int b,int c){
        return Math.min(a,Math.min(b,c));
    }


    public  static  void main(String[] args){
        int matrix[][] = { { 0, 1, 1, 0, 1, 1 },
                { 1, 1, 0, 1, 1, 1 },
                { 0, 1, 1, 1, 0, 0 },
                { 1, 1, 1, 1, 0, 0 },
                { 1, 1, 1, 1, 1, 0 },
                { 0, 1, 1, 1, 0, 1 }
        };

        System.out.println(findMaxSizeSquare(matrix));

    }
}
