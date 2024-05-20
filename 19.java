// Find the Majority Element that occurs more than N/2 times
import java.util.HashMap;
import java.util.Map;
public class array1 {
    static int majority_element(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int cnt=map.getOrDefault(arr[i], 0);
            map.put(arr[i], cnt+1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue() > arr.length/2){
                return e.getKey();
            }
        }
        return -1;
    }
    static int majorityElement(int[] arr){
        int n=arr.length;
        int ele=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[ele]){
                cnt++;
            }
            else if(arr[i]!=arr[ele]){
                cnt--;
                if(cnt==0){
                    ele=i+1;
                }
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[ele]) cnt1++;
        }
        if (cnt1 > (n / 2)) return arr[ele];
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={4,4,2,4,3,4,4,3,2,4};
        System.out.println(majority_element(arr));
        System.out.println(majorityElement(arr));
    }
}
