public class Sort {
    public static void bubbleSort(Students[] arr) {
        int n = arr.length;
        Students temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getGrade().compareTo(arr[j + 1].getGrade()) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
