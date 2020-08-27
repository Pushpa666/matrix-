1.public class MatrixAdditionExample{  
2.public static void main(String args[]){ 
 
//creating two matrices    
3.int a[][]={{1,3,4},{2,4,3},{3,4,5}}; 
   
4.int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
    
//creating another matrix to store the sum of two matrices    
5.int c[][]=new int[3][3];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices    
6.for(int i=0;i<3;i++){    
7.for(int j=0;j<3;j++){    
8.c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
9.System.out.print(c[i][j]+" ");    
10.}    
11.System.out.println();//new line    
12.}    
13.}
14.}  
