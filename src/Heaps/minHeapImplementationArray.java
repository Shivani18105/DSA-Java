package Heaps;
class MinHeap{
    private int[] arr;
    private int size;
    MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int num){
        if(size==arr.length){
            System.out.println("Capacity is full");
            return;
        }
        arr[size++] = num;
        upHeapify(size-1);
    }
    public void upHeapify(int idx){
        if(idx==0) return;
        int parent = (idx-1)/2;
        if(arr[idx]<arr[parent]){
            swap(idx,parent);
        }
    }
    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int peek(){
        return arr[0];
    }
    public int size(){
        if(size==0){
            System.out.println("Heap is empty");
            return -1;
        }
        return size;
    }
}

public class minHeapImplementationArray {
    public static void main(String[] args) {
        MinHeap pq = new MinHeap(10);
        pq.add(1);
        pq.add(7);
        System.out.println(pq.size());
    }
}
