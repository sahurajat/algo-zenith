// Print Fibonacci Series up to Nth term

public class Fibonacci {
    static int fibo_seq_recursion(int n){
        if (n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fibo_seq_recursion(n-1)+fibo_seq_recursion(n-2);
    }

    static void fibo(int n){
        int fibo_0=0;
        int fibo_1=1;
        System.out.print(fibo_0+","+fibo_1+",");
        for (int i=2;i<=n;i++){
            int fibo_2=fibo_0+fibo_1;
            System.out.print(fibo_2+",");
            fibo_0=fibo_1;
            fibo_1=fibo_2;
        }
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci sequence: ");
        System.out.println(fibo_seq_recursion(5));
        fibo(5);
    }
}
