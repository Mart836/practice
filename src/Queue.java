public class Queue<T> {
    private T [] elements;
    private int amount;

    public Queue(){
        elements = (T[]) new Object[1000];
        amount=0;
    }
    public Queue(int MaxAmountOfelement){
        elements = (T[]) new Object[MaxAmountOfelement];
        amount++;
    }
    public void Enqueue(T e){
        elements[amount] =e;
        amount++;
    }
   public T Dequeue(){
        T result = elements[0];
        for (int i = 0; i<amount; i++){
            elements[i] =elements[i+1];
        }
        amount--;
        return result;
   }
 public boolean isEmpty(){
        return amount ==0;
 }
 public T Front(){
        return elements[0];
 }
 public static void main(String [] args){
        Queue<Integer> numbers = new Queue<>();
        numbers.Enqueue(4);
        numbers.Enqueue(7);
        numbers.Enqueue(9);
        numbers.Enqueue(3);
        numbers.Enqueue(90);

        System.out.println("First element in the queue "+numbers.Front());
        System.out.println("dequeuing one elements  "+numbers.Dequeue());

        System.out.println("The first element "+numbers.Front());
        System.out.println("Is the queue empty? "+numbers.isEmpty());
        while (!numbers.isEmpty()){
            System.out.println("Dequeuing element "+numbers.Front());
            numbers.Dequeue();
        }
        System.out.println("Is the queue empty? "+numbers.isEmpty());
 }
}
