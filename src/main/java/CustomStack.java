import java.util.List;
import java.util.Stack;

public class CustomStack<T> {

    private List<T> s;

    public CustomStack(){
        s = new Stack<T>();
    }

    public boolean empty(){
        return s.isEmpty();
    }

    public T  peek(){
        return s.get(0);
    }

    public T pop(){
        return s.remove(0);
    }

    public T push(T value){
        s.add(value);
        return value;
    }

    public int search(T value){
        for( T x : s){
            if(x == value)
                 return s.indexOf( value);
        }
        return -1;
    }
}
