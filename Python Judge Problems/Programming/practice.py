class User:
    def __init__(self, name, email, BankAccount):
        self.name = name
        self.email = email
        self.account = BankAccount(int_rate=0.02, balance=0)
    
    # other methods
    
    def make_deposit(self, amount):
        self.account = self.account + amount
    # your code here
    def withdraw(self, amount):
        if amount > self.account:
            print("Deposit more money")
        else:
            self.account -= amount
    def display_user_balance(self):
        print(self.account)

