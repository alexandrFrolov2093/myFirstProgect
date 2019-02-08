package modul2.lesson11;

public abstract class Animal implements IZooAnimal {
    private int age;
    private int coast;
    private String name;

    public Animal(){
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getCoast() {
        return this.coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
