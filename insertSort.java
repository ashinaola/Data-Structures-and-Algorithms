import java.util.Scanner;

class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayIns arr = new ArrayIns(maxSize);
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            arr.insert(sc.nextLong());
        }
        sc.close();

        arr.display();
        arr.insertionSort();
        arr.display();
    }
}