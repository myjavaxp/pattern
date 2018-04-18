package com.yibo.adapt;

public class OperationAdapter implements ScoreOperation {
    private BinarySearch binarySearch;
    private QuickSort quickSort;

    public OperationAdapter() {
        binarySearch=new BinarySearch();
        quickSort=new QuickSort();
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array,key);
    }
}
