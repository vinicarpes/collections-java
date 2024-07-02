package genericsType;

public class Box<T>{

    private T t;

// T representa "Type"
    public void set(T t){this.t = t;}

    public T get(){ return t;}
}