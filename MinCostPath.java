/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MinCostPath
{
    public static int minpath(int[][] costMatrix){
     int col=costMatrix[0].length;
     int row=costMatrix.length;
     
     int minMatrix[][]=new int[row][col];
     
     minMatrix[0][0]=costMatrix[0][0];
     for(int i=1;i<row;i++){
        minMatrix[i][0]=costMatrix[i][0]+minMatrix[i-1][0]; 
     }
     for(int i=1;i<col;i++)
    {
     minMatrix[0][i]=costMatrix[0][i]+minMatrix[0][i-1];
    } 
    for(int i=1;i<row;i++){
        for(int j=1;j<col;j++){
            minMatrix[i][j]=costMatrix[i][j]+minimum(minMatrix[i-1][j],minMatrix[i-1][j-1],minMatrix[i][j-1]);
        }
    }
    
     return minMatrix[row-1][col-1];
    }
    
    
    public static int minimum(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] costMatrix = { { 3, 2, 8 }, { 1, 9, 7 }, { 0, 5, 2 }, {6, 4, 3} };
		System.out.println("the cost of the minpath is "+minpath(costMatrix));

	}
}
