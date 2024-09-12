public class Cat extends Animal implements NoiseCapable {
    
    public Cat() {
        super("Cat");
    }

    public Cat(String animalName) {
        super(animalName);
    }
    
    public void purr() {
        System.out.println(super.getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
