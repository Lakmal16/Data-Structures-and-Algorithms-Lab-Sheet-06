public class Search {
    public static int binarySearch(Students[] arr, String targetGrade) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid].getGrade().equals(targetGrade)) {
                return mid;
            } else if (arr[mid].getGrade().compareTo(targetGrade) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Grade not found
    }
}
