public class MyHeap<T>{
    private MyArrayList<T>  table;



    public MyHeap() 
    {
        table = new MyArrayList<>();
    }

    public void add(T item)
    {
        table.add(item);
    }

    public void heapify (int num) 
        
    {
        int size = table.size();
        int emormous = num;
        int rightChild = 2*num+2;
        int leftChild = 2*num+1;
        
        
        if (rightChild < size.compareTo(table.get(emormous))> 0){
            emormous = rightChild;
        }
        if (leftChild < size.compareTo(table.get(emormous))> 0){
            emormous = rightChild;
        }

        if (emormous != num) {
            T temp = table.get(emormous);
            table.set(emormous, table.get(num));
            table.set(num, temp);
            heapify(emormous);
        }

    }

    private int parent(int value)
        
    {
        return (value)/2;
    }

    private int leftChild(int value)
        
    {
        return (value*2);
    }

    private int rightChild(int value)
        
    {
        return ((value*2) + 1);
    }
    

    public boolean remove(T item)
        
    {
        if(table.contains(item))
        {
            table.remove(item);
            return true;
        }
        return false;
    }

    
    public T removeRoot()
        
    {
        T removed = table.get(0);
        table.swap(0,table.size()-1);
        table.remove(table.size()-1);
        return removed;
    }


    public void print()
        
    {
        for (int i=0; i<table.size(); i++)
        {
            System.out.println(table.get(i)+" ");
        }
    }



}
