#include <iostream>
#include <random>
#include <string>

class Password {
public:
    Password() {
        std::cout << "This is a class for creating passwords. Example: Password::getpassword(10). This creates\na password with length 10. If you want to print it, write std::cout << Password::getpassword(10) << std::endl;";
    }

    static std::string generatePassword(int length) {
        static const std::string CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";
        std::string password;
        std::random_device rd;
        std::mt19937 generator(rd());
        std::uniform_int_distribution<int> distribution(0, CHARACTERS.size() - 1);

        for (int i = 0; i < length; ++i) {
            password += CHARACTERS[distribution(generator)];
        }

        return password;
    }

    static std::string getpassword(int length) {
        return generatePassword(length);
    }
};

int main() {
    Password passwordGenerator;

    int length = 10;
    std::string generatedPassword = passwordGenerator.getpassword(length);
    std::cout << "Generated Password: " << generatedPassword << std::endl;

    return 0;
}
