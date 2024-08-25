public class Main {

    public static void main(String[] args) {
        // Create a list with a maximum size of 10
        List studentList = new List(10);

        // Create Students objects
        Students s1 = new Students("PS/2014/034", "Supun", "M", "A");
        Students s2 = new Students("PS/2014/345", "Nuwan", "M", "B");
        Students s3 = new Students("PS/2014/098", "Dasuni", "F", "B");
        Students s4 = new Students("PS/2014/019", "Kasun", "M", "A");
        Students s5 = new Students("PS/2014/109", "Nipuni", "F", "D");
        Students s6 = new Students("PS/2014/237", "Binura", "M", "A");
        Students s7 = new Students("PS/2014/200", "Ruwani", "F", "C");
        Students s8 = new Students("PS/2014/056", "Hasini", "F", "C");
        Students s9 = new Students("PS/2014/296", "Kusal", "M", "B");
        Students s10 = new Students("PS/2014/127", "Pawan", "M", "A");

        // Insert the students into the list
        studentList.insertLast(s1);
        studentList.insertLast(s2);
        studentList.insertLast(s3);
        studentList.insertLast(s4);
        studentList.insertLast(s5);
        studentList.insertLast(s6);
        studentList.insertLast(s7);
        studentList.insertLast(s8);
        studentList.insertLast(s9);
        studentList.insertLast(s10);

        // Convert the list to an array for sorting
        Students[] studentArray = new Students[studentList.listSize()];
        for (int i = 0; i < studentList.listSize(); i++) {
            studentArray[i] = studentList.retrieveList(i);
        }

        // Sort the students by grade
        Sort.bubbleSort(studentArray);

        // Display the sorted list
        studentList.traverseList();

        Sort.selectionSort(studentArray);



        // Perform binary search for a specific grade
        String targetGrade = "B";
        int index = Search.binarySearch(studentArray, targetGrade);
        if (index != -1) {
            System.out.println("Student with grade " + targetGrade + " found: " + studentArray[index]);
        } else {
            System.out.println("Student with grade " + targetGrade + " not found.");
        }
    }
}
