public class Cat extends Animal{
    private String litterPreference;

    public void eat() {
        System.out.println("nom nom nom nom");
    }

    public String getLitterPreference() {
        return this.litterPreference;
    }

    public void setLitterPreference (String litterPreference) {
        this.litterPreference = litterPreference;
    }
}
