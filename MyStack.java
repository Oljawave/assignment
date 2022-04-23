public class MyStack<T>
{
    private ArrayList<T> table;

    public MyStack()
    {
        table = new ArrayList<>();
    }

    public T push(T object)
    {
        table.add(object);
        return object;
    }

 
    public T peek()
    {
        return table.get(table.size()-1);
    }

  public T pop()
    {
        T object = table.get(table.size()-1);
        table.remove(table.size()-1);
        return object;
    }

    public int size()
    {
        return table.size();
    }
}
