package com.company.car;

import java.util.Collection;

public class BMW extends Car implements Comparable<BMW>  {
    //        (ders-24,50-ci deqiqe)-linkedList
    //BMW var tutaq ki,ve isteyirik bir nece BMW yaratmaq.

    public BMW previous;
    public BMW next;
    private double gasUsage;

    public double getGasUsage() {
        return gasUsage;
    }

    public void setGasUsage(double gasUsage) {
        this.gasUsage = gasUsage;
    }


    @Override
    public void drive() {
        System.out.println("bmw drive");
    }

    @Override
    public void stop() {
        System.out.println("bmw stop");
    }

    @Override
    public void park() {
        System.out.println("bmw park");
    }

    @Override
    public int chargeStatus() {
        return 0;
    }

    @Override
    public String changeColor(String colorName) {
        return null;
    }


    @Override
    public void foo() {

    }

    @Override
    public String toString() {
        return "BMW{" +
                "gasUsage=" + gasUsage +
                '}';
    }

    @Override
    public int compareTo(BMW o) {//ozu ile buna gonderilen ile compare edir,yeni her oncekini ondan sonra ile
//        compare edir ve ya sonraki ile evvelkini.
        if (this.getGasUsage() == o.getGasUsage()) return 0;
        if (this.getGasUsage() > o.getGasUsage()) {
            return 1;
        }
        return -1;
    }
}
