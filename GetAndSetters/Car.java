public class Car {
    // Attributes
    private String make;
    private String model;
    private int year;

    // Constructor
    Car (String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
    // Methods Getters and Setters

    // Get Methods
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }

    // Set Methods

    public void setMake(String make){
        this.make = make;
    } // How created a set method, you can put de method inside a constructor

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }
}
