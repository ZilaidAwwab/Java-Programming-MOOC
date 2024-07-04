public class Main {

    public static void main(String[] args) {
        HealthStation childernHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println(ethan.getName() + "'s weight: " + childernHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + "'s weight: " + childernHospital.weigh(peter) + " kilos");
        
        childernHospital.feed(ethan);
        childernHospital.feed(ethan);
        childernHospital.feed(ethan);
        
        System.out.println("");
        
        System.out.println(ethan.getName() + "'s weight: " + childernHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + "'s weight: " + childernHospital.weigh(peter) + " kilos");

        System.out.println("weighings performed: " + childernHospital.weighings());
        
        childernHospital.weigh(ethan);
        childernHospital.weigh(peter);
        
        System.out.println("weighings performed: " + childernHospital.weighings());
        
        childernHospital.weigh(ethan);
        childernHospital.weigh(ethan);
        childernHospital.weigh(ethan);
        childernHospital.weigh(ethan);
        
        System.out.println("weighings performed: " + childernHospital.weighings());
    }
}
