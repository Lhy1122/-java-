public class main {
    public static void main(String[] args){
        Array arr = new Array();
        arr.addFirst(114);
        arr.addLast(810);
        arr.add(1, 514);
        System.out.println(arr);
        arr.deleteElement(114);
        System.out.println(arr);
        arr.deleteLast();
        System.out.println(arr);
    }
}