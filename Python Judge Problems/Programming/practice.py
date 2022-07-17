import random as rnd
import math as mth
import datetime as dt


answer = rnd.randint(1,4)

if answer == 1:
    print("You are happy!!")

elif answer == 2:
    print("You are enough!")

elif answer == 3:
    print("She wasn't worth it!")

elif answer == 4:
    print("You did it!!")

quantity = 3
item_price = 4000.15
sales_tax = 0.065

print(f"Quantity: {quantity}")
print(f"item_price: ${item_price}")
print(f"Sales Tax: {sales_tax :.1%}")
print(f"Total: ${quantity * item_price * sales_tax :,.2f}")

print("-" * 15)
z = complex(2, -3)

print(z)

birth_date = dt.date(2001, 6, 27)
now = dt.date.today()

age = now - birth_date
delta_age = age.days
age_years = delta_age // 365
months = (delta_age % 365) // 30

print(age)
print(age_years , months)