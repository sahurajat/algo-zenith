import java.util.Scanner;
public class Hashing_calculate_freq {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("Enter the array element size:");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] hash=new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]=hash[arr[i]]+1;

        }
        int q;
        System.out.print("Enter the query size:");
        q=sc.nextInt();
        for(int i=0;i<q;i++){
            System.out.print("Enter the query element:");
            int num=sc.nextInt();
            System.out.println("The frequency is :"+hash[num]);
        }
        
    }
}
