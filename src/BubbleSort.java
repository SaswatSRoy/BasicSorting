import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int []arr,int n){
        int temp;
        int didSwap=0;
        for(int i=n-1;i>=0;i--){
            for (int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
        System.out.println("runs");
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        bubbleSort(arr,n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
