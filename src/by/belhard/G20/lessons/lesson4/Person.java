package by.belhard.G20.lessons.lesson4;

public class Person {

   private String name;


   protected int age;


   protected Country country;


    public Sex sex;

    public void walk() {
        System.out.println(name + "is walking");
    }


    public void eat(String dish) {
    int a;

        System.out.printf("%s is eating %s. Om-om-om", name, dish);
    }


    public int growOld() {
        return ++age;
    }


}
