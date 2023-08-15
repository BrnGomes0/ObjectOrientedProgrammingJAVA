public class Main {
    public static void main(String[] args){
        /*
            Static = Modifier. A single copy of a variable/method is created and shared.
            The class "ows" the static member
        */
        Friend friend1 = new Friend("Bruno");
        System.out.println(Friend.numberOfFriends);
    }
}
