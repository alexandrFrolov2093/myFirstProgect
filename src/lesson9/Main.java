package lesson9;

public class Main {//для книг
    public static void main(String[] args) {
        Book pushkin = new Book(678,"Dubrovskiy","Pushkin",1924,"tv", 20,60,40);
        Book esenin = new Book("Esenin", "qwerty",1950);
        Book book1 = new Book();

        pushkin.setCountStr(22);//перезапись страницы в методе

        pushkin.print();
        esenin.print();
        book1.print();

        System.out.println(pushkin.getCountStr());
    }
}
