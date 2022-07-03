class BankAccount:
    accounts = []
    # don't forget to add some default values for these parameters!
    def __init__(self, int_rate, balance): 
        # your code here! (remember, instance attributes go here)
        self.int_rate = int_rate
        self.balance = balance
        # don't worry about user info here; we'll involve the User class soon
    def deposit(self, amount):
        # your code here
        self.balance += amount
        return self

    def withdraw(self, amount):
        # your code here
        self.balance -= amount
        return self

    def display_account_info(self):
        # your code here
        print(self.balance)
        return
    def yield_interest(self):
        # your code here
        print(self.int_rate)
        return self
    @classmethod
    def print_all_accounts(cls):
        for account in cls.accounts:
            account.display_account_info()

BankAccount_peter = BankAccount(4,500)
BankAccount_leo = BankAccount(3, 5000)

BankAccount_peter.deposit(10).deposit(50).deposit(20).withdraw(50).yield_interest().display_account_info()
BankAccount_leo.deposit(32).deposit(32).withdraw(40).withdraw(2000).withdraw(30).withdraw(320).yield_interest().display_account_info()



BankAccount.print_all_accounts()