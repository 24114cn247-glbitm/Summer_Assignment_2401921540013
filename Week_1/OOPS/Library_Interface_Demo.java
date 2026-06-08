interface LibraryUser {
    void registerAccount();
    void requestBook();
}

class KidUsers implements LibraryUser {
    int age;
    String bookType;

    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }
    public void requestBook() {
        if (bookType.equals("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else System.out.println("Oops, you are allowed to take only kids books");
    }
}
class AdultUser implements LibraryUser{
    int age;
    String bookType;

    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    }
    public void requestBook() {
        if (bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else System.out.println("Oops, you are allowed to take only adult Fiction books");
    }
    
}

public class Library_Interface_Demo {

    public static void main(String[] args) {

        // Test Case_1 - Kid User
        System.out.println("=== Test Case_1 - Kid User ===");
        KidUsers kid_1 = new KidUsers();
        kid_1.age = 10;
        kid_1.bookType = "Kids";

        kid_1.registerAccount();
        kid_1.requestBook();

        System.out.println();

        KidUsers kid_2 = new KidUsers();
        kid_2.age = 18;
        kid_2.bookType = "Fiction";

        kid_2.registerAccount();
        kid_2.requestBook();

        System.out.println();

        // Test Case_2 - Adult User
        System.out.println("=== Test Case_2 - Adult User ===");
        AdultUser adult_1 = new AdultUser();
        adult_1.age = 5;
        adult_1.bookType = "Kids";

        adult_1.registerAccount();
        adult_1.requestBook();

        System.out.println();

        AdultUser adult_2 = new AdultUser();
        adult_2.age = 23;
        adult_2.bookType = "Fiction";

        adult_2.registerAccount();
        adult_2.requestBook();
    }
}

// Output:
/*
=== Test Case_1 - Kid User ===
// input for kid_1: age = 10, bookType = "Kids"
You have successfully registered under a Kids Account
Book Issued successfully, please return the book within 10 days

// input for kid_2: age = 18, bookType = "Fiction"
Sorry, Age must be less than 12 to register as a kid
Oops, you are allowed to take only kids books

=== Test Case_2 - Adult User ===
// input for adult_1: age = 5, bookType = "Kids"
Sorry, Age must be greater than 12 to register as an adult
Oops, you are allowed to take only adult Fiction books

// input for adult_2: age = 23, bookType = "Fiction"
You have successfully registered under an Adult Account
Book Issued successfully, please return the book within 7 days
*/