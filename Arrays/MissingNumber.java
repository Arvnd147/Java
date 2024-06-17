public class MissingNumber {
    
    public static int missingNumber(int[] a, int N) {
        // Write your code here.
        if (N == 0) {
            return 0;
        }
        int temp = 0;
        for (int i = 1; i < N; i++) {
            temp = 0;
            for (int j = 0; j < N; j++) {
                if (i == a[j+1]) {
                    temp = 1;
                }
            }
            if (temp != 1) {
                return i;
            }
        }
        return N;
    }
    public static void main(String[] args) {
        int arr[] = new int[] {2,1,4};
        int n = 4;
        System.out.println(missingNumber(arr, n));
    }
}