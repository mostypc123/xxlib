import java.security.SecureRandom;

public class Password {
    public Password() {
        System.out.println("This is a class for creating passwords. Example: Password.getpassword(10). This creates\na password with length 10. If you want to print it, write System.out.println(Password.getpassword(10)).");
    }

    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";

    public static String generatePassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(randomIndex));
        }

        return password.toString();
    }

    public static String getpassword(int length) {
        return generatePassword(length);
    }

    public static void main(String[] args) {
        Password passwordGenerator = new Password();

        int length = 10;
        String generatedPassword = passwordGenerator.getpassword(length);
        System.out.println("Generated Password: " + generatedPassword);
    }
}
