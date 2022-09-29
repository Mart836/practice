public class Stacks<T> {
    private T[] elements;
    private int amount;

    public Stacks(){
        elements = (T[]) new Object[1000];
        amount =0;
    }
    public Stacks(int MaxnumberOfelement){
        elements = (T[]) new Object[MaxnumberOfelement];
        amount++;
    }
    public void Push(T e){
        elements[amount] =e;
        amount++;
    }
    public T Pop(){
        T result = elements[amount-1];
        amount--;
        return  result;
    }
    public boolean isEmpty(){
        return amount ==0;
    }
    public T Top(){
        return elements[amount-1];
    }
    public static void main(String [] args){
        Stacks<Integer> Figures = new Stacks<>();
        Figures.Push(3);
        Figures.Push(5);
        Figures.Push(7);
        Figures.Push(9);
        Figures.Push(1);
        Figures.Push(4);

        System.out.println("The first element is "+Figures.Top());
        System.out.println("Is the Stack Empty?\n "+ Figures.isEmpty());
        System.out.println("Removing one elements ");
        Figures.Pop();

        System.out.println("The element on top is: "+ Figures.Top());
        while(!Figures.isEmpty()){
            System.out.println("Removing the element on Top "+ Figures.Top());
            Figures.Pop();
        }
        System.out.println("Is the Stack empty? \n "+Figures.isEmpty());

    }
}
