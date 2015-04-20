package Lab1;

public class Matrix {
		 public static int[][] multiply(int[][] mx1, int [][] mx2) {
		  if (mx1 == null || mx2 == null)
		   throw new IllegalArgumentException();

		  for (int i = 0; i < mx1.length; ++i) {
		   if (mx1[i] == null)
		    throw new IllegalArgumentException();
		  }

		  for (int i = 0; i < mx2.length; ++i) {
		   if (mx2[i] == null)
		    throw new IllegalArgumentException();
		  }

		  int rowLen = mx1[0].length;
		  for (int i = 1; i < mx1.length; ++i) {
		   if (mx1[i].length != rowLen)
		    throw new IllegalArgumentException();
		  }

		  rowLen = mx2[0].length;
		  for (int i = 1; i < mx2.length; ++i) {
		   if (mx2[i].length != rowLen)
		    throw new IllegalArgumentException();
		  }

		  if(mx1[0].length != mx2.length) {
		   throw new IllegalArgumentException();
		  }

		  int mx1NCols = mx1[0].length,
		    mx1NRows = mx1.length,
		    mx2NCols = mx2[0].length;

		  int[][] result = new int[mx1NRows][mx2NCols];
		  for(int i = 0; i < result.length; ++i) {
		   for(int j = 0; j < result[i].length; ++j) {
		    int res = 0;
		    for(int k = 0; k < mx1NCols; ++k) {
		     res += (mx1[i][k] * mx2[k][j]);
		    }
		    result[i][j] = res;
		   }
		  }
		  return result;
		 }

		 public static void print(int[][] mx) {
		  StringBuilder sb = new StringBuilder();
		  for(int i = 0; i < mx.length; ++i) {
		   for(int j = 0; j < mx[i].length; ++j) {
		    sb.append(String.format("%4d", mx[i][j]));
		   }
		   sb.append("\n");
		  }
		  System.out.println(sb);
		 }

		 public static void main(String[] args) {
		  int[][] d1 = {
		    { 1, 2, 3, 4 },
		    { 2, 3, 4, 5 },
		    { 3, 4, 5, 6 },
		  };
		  int[][] d2 = {
		    { 1, 2, 3, 4 },
		    { 2, 3, 4, 5 },
		    { 3, 4, 5, 6 },
		    { 4, 5, 6, 7 },
		  };
		  print(multiply(d1, d2));
		 }
		}