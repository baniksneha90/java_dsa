public class bubble_sort {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};

        int l = 0;
        int r = l + 1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[l] > arr[r]) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }

            l++;
            r++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}