package com.company.car;

public abstract class Mechanic {
//    (ders-18,part-2,21-ci deqiqe) - Concrete classin Abstract classi extend etmesi,
//    Abstract classin abstract classi extends etmesi

//    Bir abstract class diger abstract classi extend ede biler
//    Abstract olan car mechanicani extend edir, bu zaman car mechanicadaki abstract olan methodlari override etmek
//    mecburiyyetinde deyil, niye? Ona gore ki, car abstractdir, mechnanicada abstractdir. Car mechanicadan abstract
//    olan xususiyyetleri ozune goturur override elemir(override edede biler istese), cunki zaten cari extend eden
//    shexs onu override elemek mecburiyyetinde qalacaq

    public abstract void foo();//car mechanicadan foo() metodunu goturub. Eger car mechanicadan goturmush oldugu
//    foo-nu override elemese, kim ki cari extend edir o foo-nu override elemelidi.
//    Car eger mechanicadan gelen foo-nu ozu override elese artiq bmw onu override elemek mecburiyyetinde deyil,
//    niye? cunki bmw cari extend edir, car-dada abstract foo yoxdur
}
