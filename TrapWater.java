//**************TRAP RAIN WATER **************
import.java.util.*
public class TrapWater{
public static int tarapRainWater(int height[]){
    int n=height.length;
  
    //calculate left max boudarry
    int leftMax []=new int [n];
    leftMax[0]=height[0];
    for(int i=1;i<n;i++){
        leftMax[i]=Math.max(height[i], leftMax[i-1]);
     }
  
    //calculate rightmax boundary
     int rightmax[]=new int[n];
     rightmax[n-1]=height[n-1];
     for(int i=n-2;i>=0;i--){
         rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }

     int tarapRainWater=0;
     //loop
    for(int i=0;i<n;i++){
      
        //calculate water level= min of(leftmax boudary,right max boundary)
        int waterlevel=Math.min(leftMax[i], rightmax[i]);
      
        //calculate  trap water=waterlevel-height
        tarapRainWater+=waterlevel-height[i];
    }
    return tarapRainWater;

    
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of buildings: ");
       int n=sc.nextInt();
       int height[]=new int [n];
       System.out.println("\nEnter the building heights: ");
        for(int i=0;i<n;i++){
           if(sc.hasNextLine()){
               height[i]=sc.nextInt();
           }
        }
        System.out.println(); 
        System.out.println("total trapped rain water is: "+ tarapRainWater(height));  
}
}
