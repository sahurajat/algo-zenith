import java.util.Scanner;
public class Character_Hashing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str;
        System.out.print("Enter String: ");
        str=sc.nextLine();
        int[] hash=new int[256];
        for(int i=0;i<str.length();i++){
            hash[str.charAt(i)]+=1;
        }
        int q;
        System.out.print("Enter the asking query size:");
        q = sc.nextInt();
        while (q > 0) {
            char c;
            c = sc.next().charAt(0);
            System.out.println(hash[c]);
            q--;
        }
    }
}
