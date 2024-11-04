public class Pair <T, T1>{

    private T first;
    private T1 second;

    public Pair(T first, T1 second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T1 getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "First: " + first + "\n" + "Second: " + second;
    }
}
