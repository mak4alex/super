/**
 * Created by Compik on 10.10.2015.
 */
public class Cat {

    String name;

    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Meow Meow Meow "+name+"Meow";
    }
}
