public class Dog extends Animal{
    // Class Child of Animal --> Inheriting methods and attributes from the parent class
    private int breed;

    public void eat () {
        // The same method of ClassAnimal, but can do different functions/things
        System.out.println("chomp chomp chomp chomp -> Method01");
    }

    // Overloading --> The same method, but with different parameters
    public void eat (int numberOfTimes) {
        // The same method of ClassAnimal, but can do different functions/things
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("chomp chomp chomp chomp -> Method02");
        }
    }

    public int getBreed() {
        return this.breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }

}