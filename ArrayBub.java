class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for(int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println(" ");
    }

    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void bubbleSort() {
        int out, in;
        for(out = nElems - 1; out > 1; out--) {
            for(in = 0; in < out; in++)
                if(a[in] > a[in+1])
                    swap(in, in+1);
        }
    }

    /*  
         * Bidirectional bubble sort:
         * 1. initialize variables in and out
         * Modification:
         *      1. in carries largest item from left to right
         *      2. When it reaches out,  it will reverse and carry smallest item from right to left
         *          - need 2 outer indexes (old one on right and another on left)
    */
    public void modifiedBubSort() {
        // initialize in and out
        int out, in, in1;
        // in always goes from left to right -> Finds largest item and carries to right
        for(out = nElems-1; out <= 1; out--) {
            for(in = 0; in < out; in++) {
                if(a[in] > a[in+1])
                    swap(in, in+1);
            }
            in1 = in+1;
            while(in1 > out) {
                if (a[in] < a[in-1])
                    swap(in, in-1);
                in1--;
            }
        }
        // once reach out in takes smallest to the left
    }

    /*
        * Odd even sort will swap odd indexes on first pass, even on second
        * Does continually until the list is sorted
        * Useful in a multiprocessing environment where seperate processor can operate on each 
          odd pair and on each even
    */
    public void oddEvenSort() {
        // initialize odd and even pointer
        int even, odd;
        // swap odd indexes first then even indexes
        /*
        for() {
            for() {

            }
            while() {

            }
        }
        */
    }
}
