import java.util.Scanner;
public class Hashing_Q1 {
    public static void using_arr(int[] arr,int[] num){
        for(int i=0;i<num.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(num[i]==arr[j]){
                    count+=1;
                }
            }
            System.out.println(arr[i]+":"+count);
        }
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int x;
        System.out.println("Enter the query size:");
        x=sc.nextInt();
        int[] num = new int[x];
        System.out.println("Enter the element:");
        for(int i=0;i<x;i++){
            num[i]=sc.nextInt();
        }
        using_arr(arr,num);
    }
}
