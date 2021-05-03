package com.company.car;

public class Tesla extends Car {

    private double batteryUsage;

    //Demeli iki mashinimiz var BMW ve Tesla, ve iksininde ortaq xususiyyetleri var. Bu ortaq xususiyyetleri biz
//  car classi duzeldib ora ata bilerik


    public double getEnergyUsage() {
        return batteryUsage;
    }

    public void setEnergyUsage(double energyUsage) {
        this.batteryUsage = energyUsage;
    }


    @Override
    public void drive() {
        System.out.println("tesla drive");
    }

    @Override
    public void stop() {
        System.out.println("tesla stop");
    }

    @Override
    public void park() {
        System.out.println("tesla park");
    }

    public void charge() {

    }

    public void showBattery() {

    }

    public void speedUp(double speed) {//car-in speedUpi ile razilashmasa bele yazib, ozu ne cur ishleyirse
//  o curde teyin etmelidir
        System.out.println("3 saniye gozleyirem");
        this.currentSpeed += speed;
    }

    public void slowDown(double speed) {

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
}
