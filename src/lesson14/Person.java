package lesson14;

public class Person {
    private String name;
    private int age;

    public void setAge(int age) throws UnCurrentAgeExeption {
        if (age < 0 || age > 150){
            throw new UnCurrentAgeExeption("не тот возраст 0< i >150");
        }
            this.age = age;
    }
}
