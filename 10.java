import java.util.ArrayList;

public class Rearrange_array_element_by_sign {
    static int[] rearrange_bruteforce(int[] arr){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) neg.add(arr[i]);
            else pos.add(arr[i]);
        }
        for(int i=0;i<arr.length/2;i++){
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }
        return arr;
    }

    static int[] rearrange_optimal(int[] arr){
        int[] ans = new int[arr.length];
        int posIndex=0;
        int negIndex=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                if (posIndex < arr.length) {
                    ans[posIndex] = arr[i];
                    posIndex += 2;
                }
            }
            else{
                if (negIndex < arr.length) {
                    ans[negIndex] = arr[i];
                    negIndex += 2;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int A[]= {1,2,-4,-5};
        int[]ans=rearrange_optimal(A);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
