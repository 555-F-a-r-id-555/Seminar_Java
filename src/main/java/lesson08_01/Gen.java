package lesson08_01;

public class Gen<T> {
    T ob;
    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    void show(){
        System.out.println("Тип T - это " + ob.getClass().getName());
    }
}
