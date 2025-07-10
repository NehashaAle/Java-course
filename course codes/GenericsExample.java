//Generic Class

import java.util.ArrayList;

class Vegetables<T> {
    T data;

    void set(T data) {
        this.data = data;
    }

    T get() {
        return data;
    }
}

class Dog {
    // Generic Method
    public <T> void displayArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}

// Bounded Generic Types
class Data<T extends Number> {
    T[] nums;

    Data(T[] nums) {
        this.nums = nums;
    }

    float sum() {
        float sum = 0f;
        for (T n : nums) {
            sum += n.floatValue();
        }
        return sum;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        // Generic Class
        Vegetables<String> vegies = new Vegetables<>();
        vegies.set("Onion");
        System.out.println("Data: " + vegies.get());

        Vegetables<Integer> nums = new Vegetables();
        nums.set(45);
        System.out.println("Data: " + nums.get());

        // Generic Method
        String[] names = { "GermanSeferd", "BullDog", "TibetianMastiff" };
        Integer[] number = { 45, 70, 9, 66, 41 };
        Dog obj = new Dog();

        obj.displayArray(names);
        obj.displayArray(number);

        // Bounded Generic Types
        Integer[] numb = { 44, 75, 81, 90, 65 };
        Data<Integer> n = new Data<>(numb);
        System.out.println("Total int sum = " + n.sum());

        Float[] f1 = { 22f, 6.6f, 81f };
        Data<Float> f = new Data<>(f1);
        System.out.println("Total floating sum = " + f.sum());

        // Generics Collection
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        String fruits = list.get(0);
        System.out.println(fruits);
    }
}