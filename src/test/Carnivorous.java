package test;

abstract class Carnivorous extends Animal{


    public abstract void animalSound();

    public abstract void animalDiet();

    public void sleep(){
        System.out.println("Sleep Animal");
    }
}
