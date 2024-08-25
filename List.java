public class List {
    private int maxSize;
    private int position;
    private Students[] listEntry;

    List(int size) {
        this.maxSize = size;
        listEntry = new Students[maxSize];
        position = -1;
    }

    public boolean isListEmpty() {
        return position == -1;
    }

    public boolean isListFull() {
        return position == maxSize - 1;
    }

    public int listSize() {
        return position + 1;
    }

    public void insertLast(Students x) {
        if (isListFull()) {
            System.out.println("List is full");
        } else {
            listEntry[++position] = x;
        }
    }

    public void insert(int p, Students element) {
        if (isListFull()) {
            System.out.println("List is full");
        } else if (p < 0 || p > listSize()) {
            System.out.println("Position is not valid");
        } else {
            for (int i = listSize(); i > p; i--) {
                listEntry[i] = listEntry[i - 1];
            }
            listEntry[p] = element;
            position++;
        }
    }

    public void replaceList(int p, Students element) {
        if (isListEmpty()) {
            System.out.println("List is empty");
        } else if (p < 0 || p > listSize() - 1) {
            System.out.println("Position is not valid");
        } else {
            listEntry[p] = element;
        }
    }

    public void deleteList(int p) {
        if (isListEmpty()) {
            System.out.println("List is empty");
        } else if (p < 0 || p > listSize() - 1) {
            System.out.println("Position is not valid");
        } else {
            for (int i = p; i < listSize() - 1; i++) {
                listEntry[i] = listEntry[i + 1];
            }
            listEntry[--position] = null;
        }
    }

    public Students retrieveList(int p) {
        if (p < 0 || p > listSize() - 1) {
            System.out.println("Position is not valid");
            return null;
        } else {
            return listEntry[p];
        }
    }

    public  void traverseList() {
        if (isListEmpty()) {
            System.out.println("Empty list");
        } else {
            System.out.printf("%-15s %-15s %-10s %-10s\n", "ID Number", "Name", "Gender", "Grade");
            System.out.println("------------------------------------------------------------");

            for (int i = 0; i < listSize(); i++) {
                Students s = listEntry[i];
                System.out.printf("%-15s %-15s %-10s %-10s \n", s.getStudentNumber(), s.getName(), s.getGender(), s.getGrade());
            }
        }
    }
}
