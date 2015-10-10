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



    @Override
    public String toString() {
        String catView = "";
        catView += "Cat name is " + name + ". Octocat is " + age + " year old.";
        return catView;
    }

}
