import java.util.Random;
import java.util.stream.*;
public class test3
{
   public static int[][] array = new int[10][8];
   public static void main (String [] args) {
          populate();
          printArray();
          findSmallest();
          findLargest();
          findAverage();
          findMode();
          removeEvens();
          printArray();
   }
   public static void populate(){
     Random rand = new Random();
     for (int i=0; i<array.length;i++){
              for (int j=0; j<array[i].length;j++){
                array[i][j] = rand.nextInt(50)+50;  
              }
          } 
   }
   public static void printArray(){
    for (int i=0; i<array.length;i++){
              System.out.printf("\n");
              for (int j=0; j<array[i].length;j++){
                System.out.printf("%d ", array[i][j]);
              }
          }
   }     
   public static void findSmallest(){
       int small = 100;
       for (int i=0; i<array.length;i++){
              for (int j=0; j<array[i].length;j++){
                if (array[i][j]<small){
                    small = array[i][j];
                }  
              }
          } 
       System.out.printf("\nThe Smallest Number is: %d \n",small);
   }
   public static void findLargest(){
       int large = 49;
       for (int i=0; i<array.length;i++){
              for (int j=0; j<array[i].length;j++){
                if (array[i][j]>large){
                    large = array[i][j];
                }  
              }
          } 
       System.out.printf("The Largest Number is: %d \n",large);
   }
   public static void findAverage(){
       int total = 0;
       int counter = 0;
       for (int i=0; i<array.length;i++){
              for (int j=0; j<array[i].length;j++){
                total += array[i][j];
                counter++;
              }
          } 
       float average = total/counter;
       System.out.printf("The Average is: %.2f \n",average);
   }
   public static void findMode(){
        int mode=0, max=0; 
        for(int i=0;i<array.length;i++) { 
            for(int j=0;j<array[i].length;j++) { 
                int c=0; 
            for(int k=0;k<array.length;k++) { 
                for(int l=0;l<array[i].length;l++) { 
                    if(array[i][j]==array[k][l]){
                        c++; 
                    } 
                } 
                if(c>max){mode=array[i][j]; max=c; } 
                c=0; 
             }  
          }   
    }
    System.out.println("Mode="+mode);
   }
   public static void removeEvens(){
       for (int i=0; i<array.length;i++){
              for (int j=0; j<array[i].length;j++){
                if (array[i][j]%2==0){
                    array[i][j]=11;
                }  
              }
       } 
    }
}
