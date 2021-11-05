class ArrayIns {
    private long[] a;
    private int nElems;

    public ArrayIns(int max) {
        a = new long[max];
        nElems = 0; 
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for(int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println(" ");
    }

    public void insertionSort() {
        int in, out;
        for(out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while(in > 0 && a[in-1] >= temp) {
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }
    }

    // returns the median member of the array
    public long median() {
        return a[nElems / 2];
    }

    // removes duplicates from previously sorted array
    // make sure no item is moved more than once
    public long[] noDups() {
        long[] ret = new long[nElems];
        
        return ret;
    }

    // adds a counter to count how many compares and swaps were done
    public void modifiedInSort() {

    }

    // sorts the array so that there are no duplicates (removes when duplicate is found)
    public void noDupSort() {

    }
}