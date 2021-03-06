package MergeSort;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(arr, 0, 7);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);

    }

    public static void merge(int[] arr, int start, int mid, int end) {
        if (arr[mid - 1] < arr[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int[] tempArr = new int[end - start];
        int tempIndex = 0;
        while (i < mid && j < end) {
            tempArr[tempIndex++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
        System.arraycopy(tempArr, 0, arr, start, tempIndex);
    }
}
