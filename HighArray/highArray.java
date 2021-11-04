package HighArray;

class highArray {
    // demonstrates array class with high level interface
    private long[] a;
    private int nElems;

    public highArray(int max) {
        a = new long[max];  // create the array
        nElems = 0;     // no items yet
    }

    public int getnElems() {
        return nElems;
    }

    public boolean find(long searchKey) {       // find searchKey
        int j;
        for(j = 0; j < nElems; j++)    // find searchkey in array and pause loop if a[j] ==  searchkey
            if(a[j] == searchKey)
                break;
            if(j == nElems)  // not found so pause
                return false;
            else
                return true;
    }

    public void insert(long value) {
        a[nElems] = value;  // insert
        nElems++;    // increase size by one
    }

    public boolean delete(long value) {
        int j;
        for(j = 0; j < nElems; j++)
            if(value == a[j])
                break;
        if(j == nElems)
            return false;
        else {
            for(int k = j; k < nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    public void display() {
        for(int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    public long getMax() {
        long max = 0;
        for(int i = 0; i < nElems; i++) {
            if(a[i] > max)
                max = a[i];
        }
        if(a.length == 0)
            max = -1;
        return max;
    }

    public void removeMax() {
        delete(getMax());
    }

    public void noDups() {
        for(int i = 0; i < nElems-1; i++) {
            if(a[i] == a[i+1])
                delete(a[i+i]);
        }
    }
}