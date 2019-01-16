package lesson9;

public class Book {
   private int countStr;
   private String name;
   private String avtor;
   private int year;
   private String pereplet;
   private int shirina;
   private int visota;
   private int dlinna;

   public Book (){

   }

   public Book(String avtorBook, String nameBook, int yearBook) {
       avtor = avtorBook;
       name = nameBook;
       year = yearBook;
   }

   public Book(int countStrBook, String nameBook, String avtorBook, int yearBook, String perepletBook, int shirinaBook,
               int visotaBook, int dlinnaBook){
       countStr = countStrBook;
       name = nameBook;
       avtor = avtorBook;
       year = yearBook;
       pereplet = perepletBook;
       shirina = shirinaBook;
       visota = visotaBook;
       dlinna = dlinnaBook;
   }

   public void setCountStr(int newCountStr){
       countStr = newCountStr;
   }

   public int getCountStr(){
       return countStr;
   }

   public void print(){
       System.out.println("kniga : avtor " + avtor + ", nazvanie " + name + ", str " + countStr);
    }
}
