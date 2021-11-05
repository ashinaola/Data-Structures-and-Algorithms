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

        System.out.println("Testing modifiedSort()...");
        ArrayBub arr1 = new ArrayBub(maxSize);
        Scanner sc1 = new Scanner(System.in);
        
        for(int j = 0; j < 11; j++) {
            System.out.println("Enter a number to insert");
            arr1.insert(sc1.nextLong());
        }

        arr1.display();
        System.out.println("Applying modified sort...");
        arr1.modifiedBubSort();
        arr1.display();

        System.out.println("Testing oddEvenSort()...");
        ArrayBub arr2 = new ArrayBub(maxSize);
        Scanner sc2 = new Scanner(System.in);

        for(int k = 0; k < 11; k++) {
            System.out.println("Enter a number to insert");
            arr2.insert(sc2.nextLong());
        }

        arr2.display();
        System.out.println("Applying odd even sort...");
        arr2.oddEvenSort();
        arr2.display();

        sc.close();
        sc1.close();
        sc2.close();
    }
}