package modul2.lesson11;

public interface IZooAnimal {
    //переменные не изменяемы
    int month = 12;

    void voice();

    void run();

    void jump();

    //все метода public и abstract
    //создать объект интерфейса нельзя!
    //конструкторы не нужны, поля не нужны
    //все перменные по умолчанию public ststic final
}
