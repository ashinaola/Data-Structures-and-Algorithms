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

        arr.display();
        arr.bubbleSort();
        arr.display();

        System.out.println("Now testing bidirectional sort");
        ArrayBub arr1 = new ArrayBub(maxSize);
        Scanner sc1 = new Scanner(System.in);
        
        for(int j = 0; j < 11; j++) {
            System.out.println("Enter a number to insert");
            arr1.insert(sc1.nextLong());
        }

        sc.close();
        sc1.close();

        arr1.display();
        System.out.println("Applying modified sort...");
        arr1.modifiedBubSort();
        arr1.display();
    }
}