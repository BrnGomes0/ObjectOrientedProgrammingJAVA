public class Main {
    public static void main(String[] args){
        /* Encapsulation = Attributes of a class will be hidden or private, can
           be accessed only through methods (Getters & Setters)
           You should make attributes private if you don't have a reason to make them public/protected
         */
        Car car1 = new Car("Chevrolet", "Camaro", 2000);
        System.out.println(car1.getMake());
        System.out.println(car1.getMake());
        System.out.println(car1.getYear());

        car1.setMake("Honda");
        System.out.println(car1.getMake());
    }
}
