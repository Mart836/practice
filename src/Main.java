class MyList<T>{
    private T[] elements;
    private int amount;

    public MyList(){
        elements = (T[]) new Object[1000];
        amount =0;
    }
    public MyList(int MaxNumberOfElement){
        elements = (T[]) new Object[MaxNumberOfElement];
        amount++;
    }
    public void Add(T e){
        elements [amount] = e;
        amount++;
    }
    public int Length(){
        return amount;
    }
    public T Remove(int pos){
        T result = elements[pos];
        for (int i =pos; i< amount; i++){
            elements[i] = elements[1+i];
        }
        amount--;
        return result;
    }
    public boolean isEmpty(){
        return amount ==0;
    }
    public T Obtain(int Pos){
        return  elements[Pos];
    }

}
public class Main {
    public static  void printList(MyList k){
        for (int i =0; i<k.Length();i++){
            System.out.println(k.Obtain(i));
        }
    }
    public static void main(String[] args) {
        MyList<Integer> elements = new MyList<>();
        System.out.println("After creating an empty List, lis.isEmpty()");
        System.out.println("Is the List empty? "+elements.isEmpty());
        System.out.println("Printing the list");
        elements.Add(34+67);
        elements.Add(45+2);
        elements.Add(38);
        elements.Add(20);
        elements.Add(15);
        printList(elements);
        elements.Remove(3);
        System.out.print("Print list\n");
        printList(elements);
        System.out.println("Is the List empty? "+elements.isEmpty());
        System.out.println("\n");


        MyList<String> names = new MyList<>();
        System.out.println("Printing the list of Names \n");
        names.Add("Johannes Nambwandja"+ " ");
        names.Add("Valelia Mutumbulwa"+ " ");
        names.Add("Fsetus Levy"+" ");
        names.Add("Emillia cullurah"+" ");
        names.Add("Ipinge Daniel\n"+" ");
        printList(names);
        names.Remove(2);
        System.out.println("printing the List of Names\n");
        printList(names);
        System.out.println("Is the List empty? "+names.isEmpty());
    }
}