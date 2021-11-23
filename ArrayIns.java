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

    public long[] remove(long value) {
        long[] copy = new long[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++)
            if (i != index)
                copy[j++] = array[i];
        return copy;
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
    public void noDups() {
        for(int j = 0; j < nElems; j++) {
            for(int k = j+1; j < nElems; k++) {
                if(a[j] == a[k])
                    remove(a[j]);
            }
        }
    }

    // adds a counter to count how many compares and swaps were done
    // may need to adjust 
    public void modifiedInSort() {
        int in, out;
        int countSwap = 0;
        int countComp = 0;
        for(out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while(in > 0 && a[in-1] >= temp) {
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
    }

    // sorts the array so that there are no duplicates (removes when duplicate is found)
    public void noDupSort() {
        insertSort();
        noDups();
    }
}