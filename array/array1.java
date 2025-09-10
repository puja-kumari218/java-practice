package array;

public class array1 {

    public static void main(String[] args) {
        // int A[] = {3,9,7,8,12,6,15,5,4,10};
        // int sum =0;
        // for(int i=0; i<A.length; i++){
        //     sum = sum + A[i];
        // }
        // for(int X : A){
        //     sum = sum + X;
        // } 
        // System.out.println("The sum of array is: " + sum);

        // serching an element in array
        // int A[] = {3,9,7,8,12,6,15,5,4,10};
        // int key = 15;
        // for(int i=0; i<A.length; i++){
        //     if (key == A[i]){
        //       System.out.println("element fount at index: " + i);
        //       System.exit(0);                
        //     }
        // }
        // System.out.println("element not found");

        // 3. find the max element in array
        // int A[] = {3,9,7,8,12,6,15,5,4,10};
        // int max = A[0];
        // for(int i=1; i<A.length; i++){
        //     if (A[i] > max){
        //         max = A[i];
        //     }
        // }

        // System.out.println("The max element in array is: " + max);


     // 4. find the 2nd largest in array 
    int A[]={3,9,7,8,12,6,15,5,4,10};
        int max1,max2;
        
        max1=max2=A[0];
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
                
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        
        System.out.println("Second Largest is "+max2);
    

}
      
}
   