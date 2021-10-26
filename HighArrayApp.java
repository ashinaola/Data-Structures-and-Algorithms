import java.util.Scanner;

class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        highArray arr = new highArray(maxSize);
        Scanner usrInpt = new Scanner(System.in);

        for(int j = 0; j < 11; j++) {
            System.out.println("Please Enter Number...");
            arr.insert(Integer.parseInt(usrInpt.nextLine()));
        }
        
        int arrLength = arr.getnElems();

        System.out.print("Please enter searchKey...");
        String searchKey = usrInpt.nextLine();
        if(arr.find(Integer.parseInt(searchKey)))
            System.out.println("Found: " + searchKey);
        else
            System.out.println("Can't Find: " + searchKey);
        
        System.out.println("Displaying whole array");
        arr.display();

        System.out.println("Max: " + arr.getMax());
        System.out.println("Delete max");
        arr.removeMax();
        arr.display();
        usrInpt.close();

        // for rough sort
        long curMax = 0;
        highArray arrSorted = new highArray(maxSize);
        for(int i = 0; i < arrLength-1; i++) {
            curMax = arr.getMax();
            arrSorted.insert(curMax);
            arr.removeMax();
        }
        System.out.println("Sorting array...");
        arrSorted.display();

        System.out.println("Running noDups()...");
        arrSorted.noDups();
        arrSorted.display();
    }
}