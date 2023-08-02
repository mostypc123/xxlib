import random
import string
class Password:
    def __init__(self):
        print("This is a class for creating password. Example: Password.getpassword(10). This creates\na password with lenght 10. If you want to print it, write print(Password.getpassword(10)).")
    def generate_password(length):
        characters = string.ascii_letters + string.digits + string.punctuation
        password = ''.join(random.choice(characters) for _ in range(length))
        return password

    def getpassword(length, self):
        password = self.generate_password(length)
        return password
