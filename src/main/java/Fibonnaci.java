import java.util.ArrayList;

public class Fibonnaci {


    public int computeNonRecursive(int index){

        int n0 = 0 ;
        int n1 = 1;
        int aux = 0;

        if(index == 0) return 0;
        if(index == 1) return 1;

        for(int i = 1; i<index ;i++){
            aux = n0 +n1;
            n0 = n1;
            n1 = aux;
        }

        return aux;
    }

    public int computeRecursive(int index){

        if(index == 0) return 0;
        if(index == 1) return 1;
        return computeRecursive(index-1) + computeRecursive(index-2);
    }

    public static void main(String[] args) {
        Fibonnaci f = new Fibonnaci();

        int index = 100;

        long start = System.currentTimeMillis();
        System.out.println(f.computeRecursive(index));
        long end = System.currentTimeMillis();
        System.out.println("f_recursve(" + index + ") = time = " + (end - start) + "ms");

        start = System.currentTimeMillis();
        System.out.println(f.computeNonRecursive(index));
        end = System.currentTimeMillis();
        System.out.println("f(" + index + ") =  time = " + (end - start) + "ms");

    }
}
