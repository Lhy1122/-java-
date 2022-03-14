public class Array<E> {
    private E[] data;
    private int size;

    public Array(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public int getcapacity(){
        return data.length;
    }

    public int getsize(){
        return size;
    }

    public boolean isempty(){
        return size == 0;
    }

    public void add(int index, E e){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed, Index is not in range.");

        if(size == data.length)
            resize(2 * data.length);
        
        for(int i = size - 1; i >= index; i-- ){
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    public void addFirst(E e){
        add(0, e);
    }

    public void addLast(E e){
        add(size, e);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format ("size = %d, capacity = %d \n", size, data.length));
        res.append('[');
        for(int i = 0; i < size; i ++){
            res.append(data[i]);
            if(i != size - 1){
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }

    public E get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Index is not in range.");
        return data[index];
    }

    public void set(int index, E e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Index is not in range.");
        data[index] = e;
    }

    public boolean contains(E e){
        for(int i = 0; i < size; i++){
            if(data[i].equals(e))
                return true;
        }
        return false;
    }

    public int find(E e){
        for(int i = 0; i < size; i++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    public E delete(int index){
        if(index < 0 || index >= size )
            throw new IllegalArgumentException("Delete failed. Index is not in range.");
        if(index == data.length/4)
            resize(data.length/2);
        E a = data[index];
        for(int i = index; i < size - 1; i++){
            data[i] = data[i + 1];
        }
        size--;
        return a;
    }

    public E deleteFirst(){
        return delete(0);
    }

    public E deleteLast(){
        return delete(size - 1);
    }

    public void deleteElement(E e){
        if(find(e) == -1)
            throw new IllegalArgumentException("Delete failed, Can't find the parameter");
        delete(find(e));
    }

    private void resize(int newcapacity){
        E[] newdata = (E[]) new Object[newcapacity];
        for(int i = 0; i < size; i++){
            newdata[i] = data[i];
        }
        data = newdata;
    }
      
}