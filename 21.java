// Check if the given String is Palindrome or not

public class isPallindrome {
    static boolean pallindrome(String str){
        int n=str.length();
        str=str.toLowerCase();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    static boolean isPallindrome_recursive(int i,String str){
        int n=str.length();
        str=str.toLowerCase();
        if (i>=n/2) {
            return true;
        }
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
        return isPallindrome_recursive(i+1, str);
    }

    public static void main(String[] args) {
        String str="abcba"; 
        if (pallindrome(str)) {
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not pallindrome");
        }

        String name="abccba";
        if(isPallindrome_recursive(0, name)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }
}
