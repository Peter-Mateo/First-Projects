class User:
    def __init__(self, name, email, BankAccount):
        self.name = name
        self.email = email
        self.account = BankAccount(int_rate=0.02, balance=0)
    
    # other methods
    
    def make_deposit(self, amount):
        self.balance = self.balance + amount
    # your code here
    def withdraw(self, amount):
        if amount > self.account:
            print("Deposit more money")
        else:
            self.balance -= amount
    def display_user_balance(self):
        print(self.account)

# Tests

user1 = User("Peter", "p305127@gmail.com", "Suncoast")

user1.make_deposit(500)

user1.withdraw(100)

user1.withdraw(1000)

user1.display_user_balance()