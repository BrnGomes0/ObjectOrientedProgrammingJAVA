public class Mouse1 extends Mouse{
    // Attributes
    String texture = "Matte";

    // Create a constructor
    Mouse1 () {
        System.out.println("THIS IS MOUSE 01!");
    }

    // Methods
    public void setColor(String color){
        System.out.println(color);
    }

    /*This class don't have a methods of Click, but this class is inheriting*/
}
