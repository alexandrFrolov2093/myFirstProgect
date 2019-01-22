package lesson14;

public class Main {
    public static void main(String[] args) {
        //error  -  ошибка не по вине программиста
        //exception - ледит идея
        //runtimeexception - идея не следит за ошибками
        Person person = new Person();
        try {
            person.setAge(-13);
        } catch (UnCurrentAgeExeption unCurrentAgeExeption) {
            System.out.println(unCurrentAgeExeption.getMessage());
        }
        System.out.println("\\\\");
    }
}
