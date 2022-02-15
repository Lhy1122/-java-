public class Array {
    private int[] data;
    private int size;

    public Array(int capacity){
        data = new int[capacity];
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

    public void add(int index, int e){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed, Index is not in range.");

        if(size == data.length)
            throw new IllegalArgumentException("Add failed, Full capacity.");
        
        for(int i = size - 1; i >= index; i-- ){
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    public void addFirst(int e){
        if(size == data.length)
            throw new IllegalArgumentException("Add failed, Full capacity.");
        this.add(0, e);
    }

    public void addLast(int e){
        if(size == data.length)
            throw new IllegalArgumentException("Add failed, Full capacity.");
        this.add(size, e);
    }

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

    public int get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Index is not in range.");
        return data[index];
    }

    public void set(int index, int e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Index is not in range.");
        data[index] = e;
    }

    public boolean contains(int e){
        int a = 0;
        for(int i = 0; i < size; i++){
            if(data[i] == e)
                a++;
        }
        return a != 0; 
    }

    public int find(int e){
        for(int i = 0; i < size; i++){
            if(data[i] == e)
                return i;
        }
        return -1;
    }

    public int delete(int index){
        if(index < 0 || index >= size )
            throw new IllegalArgumentException("Delete failed. Index is not in range.");
        int a = data[index];
        for(int i = index; i < size - 1; i++){
            data[i] = data[i + 1];
        }
        size--;
        return a;
    }

    public void deleteFirst(){
        if(size == 0)
            throw new IllegalArgumentException("Delete failed, size = 0.");
        this.delete(0);
    }

    public void deleteLast(){
        if(size == 0)
            throw new IllegalArgumentException("Delete failed, size = 0.");
        this.delete(size - 1);
    }

    public void deleteElement(int e){
        if(find(e) == -1)
            throw new IllegalArgumentException("Delete failed, Can't find the parameter");
        this.delete(find(e));
    }
      
}