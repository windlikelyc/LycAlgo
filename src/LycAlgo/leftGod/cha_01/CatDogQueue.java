package LycAlgo.leftGod.cha_01;

import java.util.LinkedList;
import java.util.Queue;
// 猫狗队列，可以随便加入猫和狗，出队的时候也是按进入时候的猫狗出
abstract class Pet{
    private String type;

    public Pet(String type) {
        this.type = type;
    }

    public String getPetType(){
        return this.type;
    }
}

class Dog extends Pet{
    public Dog() {
        super("Dog");
    }
}

class Cat extends Pet{
    public Cat(){
        super("cat");
    }
}

class PetEnterQueue{
    private Pet pet;
    private long count;

    public PetEnterQueue(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet(){
        return this.pet;
    }

    public long getCount(){
        return this.count;
    }

    public String getEnterPetType(){
        return this.pet.getPetType();
    }
}

public class CatDogQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;

    public CatDogQueue(){
        this.dogQ = new LinkedList<PetEnterQueue>();
        this.catQ = new LinkedList<PetEnterQueue>();
        this.count = 0;
    }

    public void add(Pet pet) {
        if (pet.getPetType().equals("dog")) {
            this.dogQ.add(new PetEnterQueue(pet, count++));
        } else if (pet.getPetType().equals("cat")) {
            this.catQ.add(new PetEnterQueue(pet, this.count++));
        }else{
            throw new RuntimeException("err");
        }
    }

    public Pet pollAll(){
        if (!this.dogQ.isEmpty() && !this.catQ.isEmpty()) {
            if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()) {
                return this.dogQ.poll().getPet();
            }else {
                return this.catQ.poll().getPet();
            }
        } else if (!this.dogQ.isEmpty()) {
            return this.dogQ.poll().getPet();
        } else if (!this.catQ.isEmpty()) {
            return this.catQ.poll().getPet();
        }else {
            throw new RuntimeException("err");
        }
    }

    public Dog pollDog(){
        if (!this.isEmpty()) {
            return (Dog) this.dogQ.poll().getPet();
        }else {
            throw new RuntimeException("err");
        }
    }

    public Cat pollCat(){
        if (!this.isEmpty()) {
            return (Cat) this.catQ.poll().getPet();
        }else {
            throw new RuntimeException("err");
        }
    }

    public boolean isEmpty(){
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }

}
