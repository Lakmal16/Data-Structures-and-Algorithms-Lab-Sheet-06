public class Sort {
    public static void bubbleSort(Students [] arr){
        for(int i = 0 ; i < arr.length -1 ; i++){
            for(int j = 0 ; j < arr.length - i-1 ; j++){
                if (arr[j].getGrade().compareTo(arr[j+1].getGrade()) > 0){
                    Students temp = arr[j];
                    arr[j] =arr [j+1];
                    arr [j+1] = temp;
                     
                }
            }
        }
    } 

    public static void selectionSort(Students[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min].getGrade().compareTo(arr[j].getGrade()) > 0) {
                    min = j;
                }
            }
            
            Students temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    
        // Print the sorted array once
        System.out.println("Sorted Students by Grade:");
        for (Students student : arr) {
            System.out.println(student);
        }
    }
    
    
}


                    
            

            

                

            

