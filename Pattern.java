import java.util.*;

public class Pattern {
    //Floyd's triangle
public static void floydTriangle(int n){
    int counter=1;
       //outer loop
       for(int i=1;i<=n;i++){
        //inner loop
        for(int j=1;j<=i;j++){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
       }
}

//Inverted Half Pyramid
public static void invertedHalfPyramidWithNumbers(int n){
    //Outer loop
     for(int i=1;i<=n;i++){
        //inner loop
        for(int j=1;j<n-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
     }
  }
    
  //palindrom number pyramid
  public static void palindromPyramid(int n){
    //outer loop
    for(int i=1;i<=n;i++){
        //space
for (int j = 1; j <= (n - i) * 2; j++) {
System.out.print(" ");
}
//palindrom number
for (int k = i; k >= 1; k--) {
System.out.print(" " + k); //create left half            
}
for (int l = 2; l <= i; l++) {
System.out.print(" " + l); //create right half
}

System.out.println();
}
}

//0-1 triangle
public static void zeroOneTriangle(int n){
    //outer lop
    for(int i=1;i<=n;i++){
        //inner loop
        for(int j=1;j<=i;j++){
           if((i+j)%2==0){
            System.out.print(" 1 ");
           }
           else{
            System.out.print(" 0 ");
           }
        }
        System.out.println();
    }
}

//butterfly
public static void butterfly(int n){
    //outerloop for 1st half
    for(int i=1;i<=n;i++){
        //inner loop
        //start
        for(int j=1;j<i;j++){
            System.out.print("*");
        }
        //space
        for(int k=1;k<=2*(n-i);k++){
            System.out.print(" ");
        }
        for(int j=1;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //for 2nd half
    for(int i=n;i>=1;i--){
        //inner loop
        //start
        for(int j=1;j<i;j++){
            System.out.print("*");
        }
        //space
        for(int k=1;k<=2*(n-i);k++){
            System.out.print(" ");
        }
        for(int j=1;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

//solid rombhos
public static void solidRhombus(int n){
    //outer loop
    for(int i=1;i<=n;i++){
        //inner loop
        //space
        for(int k=n-i;k>=1;k--){
            System.out.print(" ");
        }
        //star
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

//hollow rombhos
public static void hollowRhombus(int n ){
    //outer loop
    for(int i=1;i<=n;i++){
        //inner loop
        //space
        for(int k=n-i;k>=1;k--){

            System.out.print(" ");
        }
        //start
        for(int j=1;j<=n;j++){
            if(i==1 || j==1 || i==n || j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

//diamond
public static void diamond(int n){
    //outer loop -1st half
    for(int i=1;i<=n;i++){
        //innerloop
        //space
        for(int k=1;k<=n-i;k++){
            System.out.print(" ");
        }
        //star
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //outer loop -2nd half
    for(int i=n;i>=1;i--){
        //innerloop
        //space
        for(int k=1;k<=n-i;k++){
            System.out.print(" ");
        }
        //star
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

//TRIANGLE
public static void triangle(int n){
    //outerloop
    for(int i=1;i<=n;i++){
        //innerloop
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void main(String args []) { 
    Scanner sc= new Scanner(System.in);
    System.out.println("*****Welcome to Print Pattern*****");
    System.out.print("*****Choice the numbers to print a pattern which you select*****\n Option 1: Floyd's triangle \n Option 2: Inverted Half Pyramid \n Option 3: Palindrom number pyramid \n Option 4: 0-1 triangle \n Option 5: Butterfly \n Option 6: Solid rombhos \n Option 7: Hollow rombhos \n Option 8: Diamond \n Option 9: Triangle\n");
    System.out.println("\nEnter your choice number: ");
    int choice=sc.nextInt();
    
    System.out.println("\nEnter the line number: ");
    int n=sc.nextInt();
    switch (choice) {
        case 1:
                     floydTriangle(n);
                          break;
        case 2:
                    invertedHalfPyramidWithNumbers(n);
                           break;
        case 3:
                    palindromPyramid(n);
                           break;
        case 4:
                    zeroOneTriangle(n);
                           break;
        case 5:
                    butterfly(n);
                         break;
        case 6:
                    solidRhombus(n);   
                         break;
        case 7:
                    hollowRhombus(n);
                         break;
        case 8:
                    diamond(n);
                         break;
        case 9:
                     triangle(n);
                         break;
            

        default:
                     System.out.println("*****OOPS Wrong pattern number!  Try again Later*****");
                         break;
    }
    
    }
}
