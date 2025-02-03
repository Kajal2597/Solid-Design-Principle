package employee;

// Define the custom exception class
class InvalidFirstNameException extends Exception {
    public InvalidFirstNameException(String message) {
        super(message);
    }
}

public class FirstNameCheckWithException {
    // Method to check if the first name starts with a capital letter
    public static void checkFirstName(String firstName) throws InvalidFirstNameException {
        // Regex to check if the first name starts with a capital letter
        String regex = "^[A-Z][a-z]*$";

        // If the first name does not match the regex, throw the custom exception
        if (!firstName.matches(regex)) {
            throw new InvalidFirstNameException("First name does not start with a capital letter!");
        } else {
            System.out.println("First name is valid.");
        }
    }


    public static void main(String[] args) {
        // Sample first names to test
        String firstName1 = "Kajal"; // Valid
        String firstName2 = "kajal"; // Invalid

        try {
            checkFirstName(firstName1);
        } catch (InvalidFirstNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkFirstName(firstName2);
        } catch (InvalidFirstNameException e) {
            System.out.println(e.getMessage());

            {

            }
        }
    }
}
