import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int []arr,int n){
        int min,temp;
        for(int i=0;i<=n-2;i++){
            min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        selectionSort(arr,n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
