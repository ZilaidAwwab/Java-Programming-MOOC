public abstract class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void eat() {
        System.out.println(this.animalName + " eats");
    }
    
    public void sleep() {
        System.out.println(this.animalName + " sleeps");
    }

    public String getName() {
        return this.animalName;
    }
}
