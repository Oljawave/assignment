public class MyQueue<T> {
    private LinkedList<T> table;


    public MyQueue()
    {
        table = new LinkedList<>();
    }

    public boolean add(T object) 
    {
        return table.add(object);
    }

    public T element() 
    {
        return table.getFirst();
    }

    public boolean offer(T object) 
    {
        return table.offer(object);
    }
    
     public T poll()
     {
        if(table.size() == 0){
            return null;
        }
        return table.removeFirst();
    }

    public T peek() 
    {
        if(table.size() == 0){
            return null;
        }
        return table.getFirst();
    }
    
    public T remove() {
        return table.removeFirst();
    }

    public int size() {
        return table.size();
    }
}
