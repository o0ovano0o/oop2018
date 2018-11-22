package week11;

public class Task2 {
    public static <T extends Comparable<T>> void  getmin(T[] a){
        T max=a[0];
        for(int i=0; i<a.length-1; i++) {
            if(a[i].compareTo(max)>0) {
                   max=a[i];
                }
            }
        System.out.println(max);
    }
    public static <T> void print(T[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Integer[] inte ={5245,6,3,435,89,0,12,3,9,12};
        Float[] floa = {32.3f,5.4f,0.3f,2.2f,19.7f,19.5f,3.4f,23.4f,45.4f,3.5f};
        Double[] doubl = {23.34,45.45,35.34,34.53,2.34,5.34,2.56,0.65,3.35,54.5};
        Character[] chara = {'a','d','q','e','b','f','f','l','h','p'};
        Byte[] bytes = {7,4,6,7,87,56,0,9,8,5};
        Short[] shorts = {94,54,6,3,2,123,54,65,342,65};
        Long[] longs = {3032l,2l,34l,3l,4l,234l,3452l,342l,243l,43l};
        print(inte);
        print(floa);
        print(chara);
        print(bytes);
        print(shorts);
        print(longs);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        getmin(inte);
        getmin(floa);
        getmin(doubl);
        getmin(chara);
        getmin(bytes);
        getmin(shorts);
        getmin(longs);
    }
}
