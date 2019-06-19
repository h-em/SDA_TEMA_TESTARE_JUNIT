import java.util.ArrayList;

public class Fibonnaci {


    public ArrayList computeNonRecursive(int values){

        ArrayList a = new ArrayList();
        int n0,n1;

        n0 = 0;
        n1 = 1;

        a.add(n0);
        a.add(n1);

        for(int i = 2; i <=values; i++){
            int aux = n0+n1;
            n0 = n1;
            n1 = aux;
            a.add(aux);
        }
        return a;
    }

    public ArrayList computeRecursive(int n0, int n1, int values, ArrayList list){

        if(n0 == 0){
            list.add(0);
            list.add(1);
        }
        if(values!=0){
            int aux = n0+n1;
            values--;
            list.add(aux);
            computeRecursive(n1,aux,values,list);
        }
        return list;
    }

    public static void main(String[] args) {
        Fibonnaci f = new Fibonnaci();


        System.out.println(f.computeNonRecursive(5));

        System.out.println(f.computeRecursive(0,1,10,new ArrayList()));

        int index = 1000;

        long start = System.currentTimeMillis();
        f.computeRecursive(0,1,index,new ArrayList());
        long end = System.currentTimeMillis();
        System.out.println("f_recursve(" + index + ") = time = " + (end - start) + "ms");

        start = System.currentTimeMillis();
        f.computeNonRecursive(index);
        end = System.currentTimeMillis();
        System.out.println("f(" + index + ") =  time = " + (end - start) + "ms");

    }
}
