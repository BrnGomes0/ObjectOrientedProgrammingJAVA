public class Chihuahuya extends Dog{
    // Attributes
    int avgSize = 10;
    // Methods
    public void bark() {
        System.out.println("yip yip");
    }
    @Override
    public int getAvgSize() {
        return avgSize;
    }
}
