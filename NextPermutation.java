import java.util.*;

class NextPermutation {
    public List<Integer> nextPermutation(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }
        int n = arr.size();
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) < arr.get(i + 1)) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            Collections.reverse(arr);
            return arr;
        }
        for (int i = n - 1; i > ind; i--) {
            if (arr.get(i) > arr.get(ind)) {
                Collections.swap(arr, i, ind);
                break;
            }
        }

        List<Integer> subarr = arr.subList(ind + 1, n);
        Collections.reverse(subarr);
        return arr;
    }

    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();
        int[] nums = {1, 2, 3};

        List<Integer> result = np.nextPermutation(nums);

        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
