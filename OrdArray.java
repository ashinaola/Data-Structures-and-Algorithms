import javax.lang.model.util.ElementScanner6;

class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int fetch(int indx) {
        return a[indx];
    }

    public int find(long searchKey) {
        int lower = 0;
        int upper = nElems - 1;
        int curIn;
        while(true) {
            curIn = (upper - lower) / 2;
            if(a[curIn] == searchKey)
                return curIn;
            else if(lower > upper)
                return nElems;
            else {
                if(a[curIn] < searchKey)
                    lower = curIn + 1;
                else
                    upper = curIn - 1;
            }
        }
    }

    public int fastFind(long searchKey) {
        int lower = 0;
        int upper = nElems - 1;
        int indx = upper / 2;
        while(lower < upper) {
            if(a[indx] == searchKey)
                return indx;
            else if(a[indx] < searchKey)
                indx = (indx - 1) / 2;
            else {
                indx--;
                indx /= 2;
            }
        }
        return 0;
    }

    public void insert(long value) {
        int j;
        for(j = 0; j < nElems; j++)
            if(a[j] > value)
                break;
        for(int k = nElems; k > j; k--)
            a[k] = a[k-1];
        a[j] = value;
        nElems++;
    }

    // fastInsert (insert using binary search)
    public void fastInsert(long value) {
        int found = fastFind(value);
        for(int k = nElems-1; k > found; k--)
            a[k] = a[k-1];
        a[found] = value;
    }

    public boolean delete(long value) {
        int j = find(value);
        if(j == nElems)
            return false;
        else {
            for(int k = j; k < nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    // fastDelete (delete using binary search)
    public boolean fastDelete(long value) {
        int j = fastFind(value);
        if(j == nElems)
            return false;
        else {
            for(int k = j; k < nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    public OrdArray merge(OrdArray arr1, OrdArray arr2) {
        int arr1Ctr = 0;
        int arr2Ctr = 0;
        int retArraySize = arr1.size() + arr2.size();
        OrdArray retArray = new OrdArray(retArraySize);
        for(int i = 0; i < retArraySize; i++) {
            if(arr1.fetch(arr1Ctr) < arr2.fetch(arr2Ctr)) {
                retArray.insert(arr1.fetch(arr1Ctr));
                arr1Ctr++;
            }
            else if(arr1.fetch(i) > arr2.fetch(i)) {
                retArray.insert(arr2.fetch(arr2Ctr));
                arr2Ctr++;
            }
            else {
                retArray.insert(arr1.fetch(arr1Ctr));
                retArray.insert(arr2.fetch(arr2Ctr));
                arr1Ctr++;
                arr2Ctr++;
            }
        }
        return retArray;
    } 

    public void display() {
        for(int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }
}