class BankAccount:

    def __init__(self, first_name, last_name, bank, account, currency, taxes):
        self.first_name = first_name
        self.last_name = last_name
        self.bank = bank
        self.currency = currency
        self.account = account
        self.taxes = taxes

    def display_amount(self):
        print(f"{self.bank}:{self.currency} {self.account}")

    def account_info(self):
        print(f"{self.first_name} {self.last_name}")
        print(f"{self.bank}")
        print(f"{self.currency} {self.account}")
    
    def withdraw(self, amount):
        if amount > self.account:
            print(f"Not enough money to withdraw from {self.bank}")
            print(f"New balance {self.account}")
        else:
            self.account = self.account - amount
            print(f"Successfully withdrawn {amount} from {self.bank}")
    
    def deposit(self, amount):
        self.account = self.account + amount
        print("Deposited")

    def purchase(self, amount):
        if self.account > amount:
            self.account = self.account - amount
            print("Purchase Successful")
        else:
            print(f"Not enough money to purchase")


class Shoe:
    def __init__(self, brand, style, size, price):
        self.brand = brand
        self.style = style
        self.size = size
        self.price = price

    def price_changed(self, price):
        self.price = price




User = BankAccount("Peter", "Mateo", "Suncoast", 500, "USD", .07)
Jordan_11 = Shoe("Jordan", "Basketball", 13, 400)

Jordan_11.price_changed(500)

print(Jordan_11.price)


print("-" * 15)
User.account_info()
print("-" * 15)
User.display_amount()
print("-" * 15)
User.withdraw(600)
print("-" * 15)
User.deposit(1000)
print("-" * 15)
User.display_amount()
print("-" * 15)
User.purchase(500)
print("-" * 15)
User.display_amount()
print("-" * 15)
User.purchase(5000)
print("-" * 15)
User.withdraw(600)
print("-" * 15)
User.account_info()