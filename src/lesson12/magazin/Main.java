package lesson12.magazin;

public class Main {
    public static void main(String[] args) {
        Photo photo = new Photo("https://kupit-skovorodu.ru/upload/iblock/0f2/52.jpg", "Кастрюля 7,0 литров с рисунком СТАЛЬЭМАЛЬ Сталь эмалированная");
        Photo photo1 = new Photo("https://kupit-skovorodu.ru/upload/iblock/515/53.jpg", "Кастрюля 7,0 литров с рисунком СТАЛЬЭМАЛЬ Сталь эмалированная");

        Harakteristika harakteristika = new Harakteristika();
        harakteristika.setDiametr(26);
        harakteristika.setMaterial("Сталь эмалированная");
        harakteristika.setObyom(7);
        harakteristika.setVes(1900);
        harakteristika.setRazmer("выс. 16 см");

        Tovar joltayaKastrula = new Tovar();
        joltayaKastrula.setMainName("Кастрюля 7,0 литров с рисунком СТАЛЬЭМАЛЬ Сталь эмалированная");
        joltayaKastrula.setArticul("1с18с");
        joltayaKastrula.setPrice(790);
        joltayaKastrula.setHarakteristika(harakteristika);
        joltayaKastrula.setGlavPhoto(photo1);
        joltayaKastrula.setMaimInfo("Посуда выполнена из тонколистового стального проката, покрытого двумя слоями эмали. Эмалевое покрытие имеет существенные преимущества по показателям безопасности влияния на организм человека, санитарным свойствам, простоте ухода и рассчитан на длительный срок эксплуатации. Оно устойчиво к перепадам температуры до 220°С, обладает высокой механической прочностью, противостоит воздействию пищевых кислот. \n" +
                "Эмалированную посуду нельзя ронять, нагревать без жидкости, допускать замерзания в ней жидкости, чистить металлической мочалкой. \n" +
                "Пригодно для использования на всех видах плит, включая индукционные. Можно мыть в посудомоечной машине.\n" +
                "\n" +
                "Посуда снабжена удобными ручками и крышкой. Внешние стенки декорированы изображением клубники. \n" +
                "Подходит для всех типов плит, включая индукционные. \n" +
                "\n" +
                "Ширина (с учетом ручек): 33 см. \n" +
                "Высота стенки: 16 см.");
        joltayaKastrula.setShortName("Кастрюля эмалированная \"СтальЭмаль\" изготовлена из высококачественного стального проката, покрытого двумя слоями жаропрочной эмали.");
        joltayaKastrula.potoToDopPhoto(photo);
        joltayaKastrula.potoToDopPhoto(photo1);
        //joltayaKastrula.setRecomendTovars();
        //System.out.println(joltayaKastrula.toString());


        Photo photo3 = new Photo("https://kupit-skovorodu.ru/upload/iblock/0f2/50.jpg", "Кастрюля чугунная 4,0 литра БИОЛ со стеклянной крышкой");


        Harakteristika harakteristika2 = new Harakteristika();
        harakteristika2.setDiametr(22);
        harakteristika2.setMaterial("Чугун черный");
        harakteristika2.setObyom(4);
        harakteristika2.setVes(3515);
        harakteristika2.setRazmer("высота 145 мм");


        Tovar chirnayaKastrula = new Tovar();
        chirnayaKastrula.setMainName("Кастрюля чугунная 4,0 литра БИОЛ со стеклянной крышкой\n");
        chirnayaKastrula.setArticul("0204С");
        chirnayaKastrula.setPrice(2190);
        chirnayaKastrula.setHarakteristika(harakteristika2);
        chirnayaKastrula.setGlavPhoto(photo1);
        chirnayaKastrula.setMaimInfo("Для любителей тушеных блюд идеальный вариант - чугунная кастрюля, поскольку именно благодаря толстым стенкам при тушении сохраняется всё вкусовое богатство и пикантный аромат блюда.\n" +
                "\n" +
                "Чугунная кастрюля в комплекте со стеклянной крышкой позволяет контролировать процесс приготовления.\n" +
                "Чугунная кастрюля в комплекте с чугунной крышкой-сковородой 2 в 1\n" +
                "Кастрюля - обязательный предмет посуды на абсолютно любой кухне: каши и супы, компоты и морсы, на самом деле, так или иначе, кастрюли принимают участие в приготовлении практически любых блюд.\n" +
                "Эта кастрюля - целиком литой продукт, выполнена из высококачественного чугуна. Крышка - стеклянная, полностью покрывает поверхность кастрюли, не оставляя зазоров. Кастрюля долговечна и износостойка." +
                " Прекрасно подходит для использования в тандеме с самыми различными видами плит: электрическими, керамическими, галогенными, газовыми и индукционными, также возможно использовать в духовке - многие хозяйки" +
                " практикуют использование подобных кастрюль как форм для выпекания. Обладает двумя удобными ручками. Возможно купить такую сковороду в трех различных размерах: 3, 4 и 6 литров, диаметр - 20, 22 и 26 сантиметров соответственно." +
                " Толщина дна кастрюли составляет 4 миллиметра");
        chirnayaKastrula.setShortName("Кастрюля чугунная 4,0 литра БИОЛ со стеклянной крышкой");
        chirnayaKastrula.potoToDopPhoto(photo);
        chirnayaKastrula.potoToDopPhoto(photo1);
        //joltayaKastrula.setRecomendTovars();
        Filtr.printChipestTovar(joltayaKastrula, chirnayaKastrula);
    }
}
