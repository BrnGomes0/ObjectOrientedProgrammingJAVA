public class Dog extends Animal{
    @Override // This method replace a method Speak of ParentClass (Replace Method)
    void speak () {
        System.out.println("The dog goes *bark*!");
    }
}
