package CCI.stacks_and_queues;

import java.util.LinkedList;

public class AnimalShelter {
    LinkedList<Dog> dog = new LinkedList<>();
    LinkedList<Cat> cat = new LinkedList<>();
    int order =0;
    private void enqueue(Animal a){
        a.setOrder(order);
        order++;

        if (a instanceof Dog) dog.addLast((Dog) a);
        else if (a instanceof Cat) {
            cat.addLast((Cat)a);
        }
    }
    private Animal dequeueAny(){
        if (dog.size()==0){
            return dequeCat();
        } else if (cat.size()==0) {
            return dequeDog();
        }

        Dog dg = dog.peek();
        Cat ct = cat.peek();

        if (dg.isOlderThan(ct)){
            return dequeDog();
        }else
            return dequeCat();
    }
    private Dog dequeDog(){
        return dog.poll();
    }
    private Cat dequeCat(){
        return cat.poll();
    }
}
abstract class Animal{
    private int order =0;
    protected String name;
    public Animal(String name ){
        this.name = name;
    }
    public void setOrder(int ord){
        this.order = ord;
    }
    public int getOrder() {
        return order;
    }

    public boolean isOlderThan(Animal a){
        return this.order < a.getOrder();
    }
}
 class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
}
