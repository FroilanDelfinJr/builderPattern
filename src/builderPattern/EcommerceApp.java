package builderPattern;

public class EcommerceApp {
    public static void main (String[] args){

        User user1 = new User.UserBuilder()
                .firstName("Juan")
                .lastName("Dela Cruz")
                .email("juan_delacruz@gmail.com")
                .address("#151 Samson Road")
                .phone("+639123456789")
                .age(30)
                .build();

        System.out.println("First Name: " + user1.firstName);
        System.out.println("Last Name: " + user1.lastName);
        System.out.println("Email: " + user1.email);
        System.out.println("Address: " + user1.address);
        System.out.println("Phone Number: " + user1.phone);
        System.out.println("Age: " + user1.age);
        System.out.println();

        User user2 = new User.UserBuilder()
                .firstName("Dos")
                .lastName("Santos")
                .email("dos.santos@gmail.com")
                .age(26)
                .build();

        System.out.println("First Name: " + user2.firstName);
        System.out.println("Last Name: " + user2.lastName);
        System.out.println("Email: " + user2.email);
        System.out.println("Address: " + user2.address);
        System.out.println("Phone Number: " + user2.phone);
        System.out.println("Age: " + user2.age);
        System.out.println();

        User user3 = new User.UserBuilder()
                .email("martintres@gmail.com")
                .firstName("Tres")
                .age(21)
                .address("20 Evangelista Street")
                .phone("+639246813579")
                .lastName("Martin")
                .build();

        System.out.println("First Name: " + user3.firstName);
        System.out.println("Last Name: " + user3.lastName);
        System.out.println("Email: " + user3.email);
        System.out.println("Address: " + user3.address);
        System.out.println("Phone Number: " + user3.phone);
        System.out.println("Age: " + user3.age);
    }
}
