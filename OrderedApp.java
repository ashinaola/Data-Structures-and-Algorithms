import java.util.Scanner;

class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr = new OrdArray(maxSize);

        Scanner usrInpt = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            System.out.println("Type number to insert");
            arr.insert(usrInpt.nextLong());
        }
        System.out.print("arr: ");
        arr.display();

        long searchKey = usrInpt.nextLong();
        if(arr.find(searchKey) != arr.size())
            System.out.println("Found: " + searchKey);
        else 
            System.out.println("Can't find " + searchKey);
        
        arr.display();

        System.out.println("How many to delete?");
        int delAmmt = usrInpt.nextInt();
        for(int i = 0; i < delAmmt; i++) {
            System.out.println("Choose number");
            arr.display();
            long selection = usrInpt.nextLong();
            arr.delete(selection);
        }
        arr.display();

        System.out.println("Testing merge");
        OrdArray array1 = new OrdArray(5);
        for(int i = 0; i < array1.size(); i++)
            array1.insert(i);
        OrdArray array2 = new OrdArray(5);
        for(int i = 5; i < array1.size(); i++)
            array2.insert(i);
        OrdArray array3 = array2.merge(array1, array2);
        array3.display();
        usrInpt.close();
    }
}
