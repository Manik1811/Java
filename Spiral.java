import java.util.*;
public class Spiral{
public static void  spiralMatrix(int matrix[][]){
int sr=0,sC=0,eR=matrix.length-1,eC=matrix[0].length-1;
while(sr<=eR  &&  sC<=eC){
 //TOP
for(int j=sC;j<=eC;j++){
System.out.print(matrix[sr][j]+" ");
}
//RIGHT
for(int i=sr+1;i<=eR;i++){
System.out.print(matrix[i][eC]+" ");
}
//BOTTOM
for(int j=eC-1;j>=sC;j--){
if(sC==eC){
break;
}
System.out.print(matrix[eC][j]+" ");
}
//LEFT
for(int i=eR-1;i>=sr+1;i--){
if(sr==eR){
break;
}
System.out.print(matrix[i][sC]+" ");
}
sr++;
eR--;
sC++;
eC--;

}
System.out.println();
}


public static void main(String [] args){
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        System.out.println("\nEnter the number of columns: ");
       int m=sc.nextInt();
        int matrix[][]=new int[n][m];
         n=matrix.length;   m=matrix[0].length;
         System.out.print("\n Enter the elements of the matrix: ");
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
            
         } 
         System.out.println();
         System.out.println("The maxtrix is: ");
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         } 
            
            System.out.println(); 
            spiralMatrix(matrix);
}
}
