import java.util.*;
public class Binarysearch {
    public static void main(String[] args)
{
    int i,n,j,temp;
    int arr[]=new int[10];
    Scanner rc=new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    n=rc.nextInt();
    System.out.println("Enter the array elements:");
    for(i=0;i<n;i++){
        arr[i]=rc.nextInt();

    }
    //-----BUBBLE SORT PROCESS::
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-1;j++){
        if(arr[j]>arr[j+1]){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

        }
    }
}    
//---------------printing the sorted array:
System.out.println("The sorted array is:");
for(i=0;i<n;i++){
    System.out.println(arr[i]);
}
}
}

