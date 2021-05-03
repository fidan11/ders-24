package com.company.car;

import java.util.Map;

public abstract class Car extends Mechanic { // bele yazmaqla biz deyirik, ki car deye bir class var, amma bu mueyyen deyil, yeni
//    bu classin ne ish gormeyi mueyyen deyil. Bu classin ichinde bezi methodlar var ve bu metodlar mutleq shekilde
//    override olunmalidi ve nece ishlediyi teyin olunmalidir.

    protected double hp;
    protected double maxSpeed;
    protected double currentSpeed;
    protected String color;

    //Bu usul ile biz meqsedimize catiriq, ortaq Car duzeldirik ve o Cardan extend edirik, bilirik ki BMW-de Tesla-da
//    cardir, sonra bunu polimorphisimede tetbiq ede bilerik.
//    Yeni car-in teleb olundugu yerlerde bmw-nide istifade ede bilerik teslanida ve s.
//    Amma bele bir mesele var ki, bu Car classi bu deqiqe ozunu tek olaraq obyekt kimi apara biler, yeni
//    biz bmw ve teslaya ehtiyyac duymadan car classinin obyektini yarada bilerik.Main classina kecib
//    Car c = new Car() deye bilerik. Indi bu car ne bmw-dir nede ki tesla. Ve bu carin bezi xususiyyetleri var,
//    hansi ki, meselen, park xususiyyeti(methodu). Bmwnin bir park xususuiyyeti var, bmw bir cur park edir, tesla
//    bir cur, bmw bir cur suretini qaldirir tesla bir cur,cunki tamami ile ayri ayri texnologiyalardi, amma car
//    haqqinda danisanda bunun spesifikasiyasi teyin olunmayib bu havadadir, bele bir shey yoxdur axi.
//    Class olaraq var, texniki olaraq biz onun obyektini yarada bilerik, amma sual sorushmaga gelende,meselen,
//    bu car-i nece park edir nece stop edir ve s? - bu suallarin hech birinin cavabi yoxdur, hamisi havadadir.
//    Ona gore de, biz burada bir texniki mehdudiyyet yaratmaliyiq ki, kimse bu car classinin obyektini yaratsa,
//    mecbur olsun ozu o carin,yeni yaratmish oldugu car obyektinin xasiyyetlerini(behaviorlarini),
//    nece reftar etdiyini teyin etsin programmist ozu, bunu teyin etmek mecburiyyetinde qalsin.
//    Biz bu mecburiyyeti ish yoldashlarimiz arasinda danisaraqda yarada bilerik, deye bilerik ki, hec kes car
//    classinin obyektini yaratmasin, eger her hansisa bir car istifade etmek isteyirsizse bu zaman car classini
//    extend edin ve daha sonra gelin oz classinizda hemin o xususiyyetleri override ederek onlarin nece bash verdiyini
//    deyin. Meselen, bmw classinda park() methodu duzelt ve bunu override ele. Ve bmw nece park edir onu burada
//    izah ele. Tesla tamam basqa cure ede biler. Bu prosesi soz ile oz aramizda danisa bilerik, amma bu duzgun yanasma
//    deyil, biz oz sozumuzu kodlarimiz vasitesi ile demeliyik. Biz ele bir kitabxana yaratmaliyiq ki, bundan
//    programistler istifade ede bilsin. Car-in abstract oldugunu goren bir shexs basha dusecek ki, men oz classimi
//    yaradib, onu cardan extend ederek oz xususiyyetlerimi vere bilerem ve artiq bu project bu yeni classi bir car
//    olaraq gorecek. Biz abstract yazaraq bu mecburiyyeti yaradiriq.

//    Abstract yazmaqla biz deyirik, ki car deye bir class var, amma bu mueyyen deyil, yeni
//    bu classin ne ish gor/meyi mueyyen deyil. Bu classin ichinde bezi methodlar var ve bu metodlar mutleq shekilde
//    override olunmalidi ve nece ishlediyi teyin olunmalidir. Sual yarana biler: Eger BMW Car-i override edecekse
//    niye gore extend edir? Gotursun ozu oz classinda oz methodunu yazsinda? Ona gore extend edir ki, ozunu her yerde
//    car kimi apara bilsin. Yeni ki, car teleb olunan yerde bmw obyektini gonderib, onun park() methodunu rahatliqla
//    cagira bilek. Abstract classi ona gore var ki - biz car classinda teyin edirik istenilen car olan bir classin
//    neleri olmalidir. Metoda abstract yaza bilerik bedenini silerek. Yeni bu methodun ozu var bedeni yoxdur, ne
//    ish goreceyi bilinmir. Methodlara abstract yazmaq o demekdir ki, istenilen carda bu methodlar muteleq olmalidir.
//    Yeni method var, amma hansi nece ishleyecek bunu artiq classlarin ozleri teyin edecek.
//    Bezi methodlarda ise abstract sozu olmaya biler, yeni mueyyen ola biler, yeni car classinan extend elemisense
//    ele methodlar var ki, onlar mueyyendir, yeni bilinir ne ish goreceyi.

//    Car classini yaratmisiq ve istifadecini mecbur etmek isteyirk ki drive(), stop(), park() ozu overide elesin.
//    SpeedUp() ve slowDown ise ozu onlalrin evezinden hell edir. Getter setterleride ozu diger classlarin evezinden
//    hell edir, cunki bilir getter setter ne cur ishleyir, yeni diger classlarin getter ve setterleri override etmek
//    mecburiyyeti olmur.


    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public abstract void drive();

    public abstract void stop();

    public abstract void park();//metodun ozu var bedeni yoxdur, ne ish goreceyi bilinmir

    public void speedUp(double speed) {//sureti artir, speed qeder artir, mueyyen methoddur ne iw goreceyi bellidir
        this.currentSpeed += speed;
    }

    public void slowDown(double speed) {//sureti azalt
        System.out.println("slow down:" + speed);
        this.currentSpeed -= speed;
    }

    public abstract int chargeStatus();

    public abstract String changeColor(String colorName);

//    (ders-18,part2,5-ci deqiqe)
    public void slowDownAndStop() {//bu method ne edir?evvelve slowdownu cagirir
        slowDown(this.currentSpeed);//indiki speed qeder azalt
        stop();
        //slowDown concrete methoddur ve concrete methodu cagirir, stop ise abstract methoddur, lakin abstract
//      methoduda cagira bilir. Sual vere bilerik ki, nece olur concrete method abstract methodu cagirir, axi
//      concrete method abstract methodun ne ish gorduyunu bilmir. Bunun cavabi odur ki, bu classin obyekti
//      yaradilibsa, mutleq shekilde stopun ne ish gorduyu deyilmelidir. Deyilirse bu o demekdir ki, slowDown()
//      cagirilanda artiq stopun ne ish gorduyu teyin olunmush olur. Hara baxirsan bax, hansi classin obyektini
//      yaradirsansa yarat, orada mutleq shekilde stop-un nece ish gorduyu qeyd olunub, buda o demekdir ki,
//      slowDownStop() methodunu cagiranda slowDown conrete oldugu ucun ne ish gorduyu bellidir, stopda belli olacaq.
//      Lakin slowDownStop() obyekte esasen ish gorecek, yeni bmw-nin ve ya tesla-nin ichinde bu methodu yazmaq
//      mecburiyyetimiz yoxdur. Sen bmw ve teslada onun stopunun nece ish gorduyunu yaz, avtomatik slowDown ve stop
//      methodu o classlarda mutleq olacaq. Abstractionun bu terefdende ustunluyunu gormush olduq. Adam nece ish gorduyunu
//      bilmeden o methodu cagira bilir ve belelikle complex bir method yaratmish ola bilir.
    }

    public void changeColorUpToChargeStatus(){//bu metod chargeStatus ve changeColor methodlarini cagirir,
//      amma onlarin nece islediyini bilmeden cagirir, her iki method abstractdir. Biz ele bir concrete
//      method qurduq ki, bu method concrete method abstract methodlari cagiraraq concrete bir ish gorur.
//      Bunuda nece gorur? Biz bmw classini yaradanda changeStatusun  ve changeColorun nece ishlediyini
//      teyin etmek mecburiyyetinde qalacagiq.
        if(chargeStatus()<40){
            changeColor("red");
        }
    }


}

