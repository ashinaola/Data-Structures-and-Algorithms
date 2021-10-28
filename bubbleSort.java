import java.util.Scanner;

class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arr = new ArrayBub(maxSize);
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 11; i++) {
            System.out.println("Enter a number to insert");
            arr.insert(sc.nextLong());
        }
        sc.close();

        arr.display();
        arr.bubbleSort();
        arr.display();
    }
}