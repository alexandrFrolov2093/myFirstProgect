package lesson12.magazin.homeWork;

public class Main {
    public static void main(String[] args) {
        Tovar utug = new Tovar();
        Photo glavPhoto = new Photo("https://c.dns-shop.ru/thumb/st1/fit/wm/800/650/ed03766603bd40e29f1b6eb94e202341/51cf22a4ea3fb8e30feecee56ad05f407c23dc5b791582350b0974fa50ddc38c.jpg",
                "Утюг DEXP SW-107 голубой");
        Photo photo = new Photo("https://c.dns-shop.ru/thumb/st1/fit/wm/800/650/a94662c82f1f05e48f854d2cb0180c67/828ff989834e4668dba023221ccd458bbd48687345e35d35c81b5ca5b4296a25.jpg" ,
                "Утюг DEXP SW-107 голубой");
        Photo photo1 = new Photo("https://c.dns-shop.ru/thumb/st1/fit/wm/800/650/54d59963870bc986e80275ce02b55042/20dcc144be5965a05a00e8a4977c14ae024b0e24268c58abdc00b6d662e5df24.jpg",
                "Утюг DEXP SW-107 голубой" );
        Photo photo2 = new Photo("https://c.dns-shop.ru/thumb/st1/fit/wm/800/650/92e814cccbed579a11542b09e9e8bb93/2d124e8557f740ce79d2e56f411fd52e3ae6d11c146753faddc56e9b443b78c5.jpg",
                "Утюг DEXP SW-107 голубой" );
        Photo photo3 = new Photo("https://c.dns-shop.ru/thumb/st1/fit/wm/800/650/488f6c80d7f7fe8e0dd3a6ada47200fa/62f28ace1fdea6e428b62e6edbb03afaf85b76c76ee98dafd96129a2fccce016.jpg",
                "Утюг DEXP SW-107 голубой");

        utug.setGlavPhoto(glavPhoto);
        utug.potoToDopPhoto(glavPhoto);
        utug.potoToDopPhoto(photo);
        utug.potoToDopPhoto(photo1);
        utug.potoToDopPhoto(photo2);
        utug.potoToDopPhoto(photo3);

        Harakteristika harakteristika = new Harakteristika();
        harakteristika.setMoshnost(1200 );
        harakteristika.setAvtoVicluchenie("нет");
        harakteristika.setBesprovodnoeIspolzovanie("нет");
        harakteristika.setDlinnaShnura(1.8);
        harakteristika.setFuncRazbryzgivaniya("есть");
        harakteristika.setKomplektaciya("документация, мерный стакан");
        harakteristika.setParovoyUdar("есть");
        utug.setHarakteristika(harakteristika);

        Komentarii komentarii = new Komentarii();
        komentarii.setKomentariy("Товар оформлял на сайте, оплата тоже онлайн. С магазина забирала жена, говорит, что не выдали ни чека, ни товарника, ни чего-то еще. Так и должно быть?\n");
        utug.addKomentariyToKomentarii(komentarii);

        Otzyv otzyv = new Otzyv();
        otzyv.setName("Сергей");
        otzyv.setDostoinstva("Отличный утюг,небольшой,гладит хорошо.Есть все основные функции");
        otzyv.setNedostatky("пока нет");
        otzyv.setKamenariy("Брал в чёрную пятницу за очень привлекательную цену,лучше было бы не найти!");
        Otzyv otzyv1 = new Otzyv();
        otzyv1.setName("Иван_три два два");
        otzyv1.setKamenariy("По факту подсветка белая, просто стекло зеленого светы, с голубой подсветкой и белым стеклом, выглядят лучше чайники");
        otzyv1.setNedostatky("из недостатков, когда мало воды. то она льется через крышку, от крышки долго пахнет платиком, но вода после нескольких кипячений нормальная");
        otzyv1.setDostoinstva("Обычный чайник, кипятит воду.");
        utug.addOtzivToOtziv(otzyv);
        utug.addOtzivToOtziv(otzyv1);

        utug.setName("Утюг DEXP SW-107 голубой");
        utug.setOcenka(4.5);
        utug.setPrice(450);
        utug.setStarayaPrice(750);
        utug.setOpisanie("Утюг DEXP SW-107 голубой отличают компактные размеры и вес, равный всего 0.9 кг, так что он не утомит держащую его руку даже при длительном непрерывном использовании. Его небольшой пластиковый корпус оформлен в белых и голубых тонах, резервуар сделан прозрачным для контроля за уровнем воды. Для деликатного глажения предусмотрены системы разбрызгивания воды и парового удара.\n" +
                "Абсолютно гладкая подошва DEXP SW-107 выполнена из нержавеющей стали, она скользит по ткани, не повреждая ее. Сетевой шнур утюга крепится при помощи шаровой установки и имеет достаточную длину в 1.8 м. Вы не пожалеете, выбрав такой симпатичный и надежный утюг для дома.");
        utug.setSrokGarantii("12 мес.");
        utug.setSrticul("1041363");
        utug.setStranaProizvodstva("Китай");
        System.out.println(utug.toString());


    }
}

 //mainName String
//articul String
//massFoto []Photo
//massVidio []Video
//ценаОсновная int
//ценаСкидочная int =
//massOtzivov []Otziv
//massMagazinov в каких магазинах есть товар []Magaz
//гарантия String
//описание String
//производитель String
//многоХарактеристик []Harakteristica
//много коментариев []Komentariy
//много обзоров []Review
//много опросов и ответов []Faq
//много файлов []File
//много драйверов []Drivers

//Otziv
//балл
//пользователь  Polsovatel
//город//
//магаз в котором куплено
//достоинства
//недостатки
//коментарий
//фото
//лайки


//Polsovatel
//имя
//аватар
//дата регистрации
//фото
//город


