/*
 * @Author: your name
 * @Date: 2022-02-14 20:13:08
 * @LastEditTime: 2022-02-15 11:25:08
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\02-Arrays\04-Query-and-Update-Element\Array.java
 */
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
    //查询索引index位置的元
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
      
}

