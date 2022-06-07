

weight = 8.4
groundshipping_flat = 20
droneship_flat = 0

#Ground Shipping
if weight <= 2:
    price = (weight * 1.50) + groundshipping_flat 
    print("To ship your package with ground shipping it will cost:")
    print(price)

elif weight > 2 and weight <= 6:
    price = (weight * 3.00) + groundshipping_flat 
    print("To ship your package with ground shipping it will cost:")
    print(price)

elif weight > 6 and weight <= 10:
    price = (weight * 4.00) + groundshipping_flat 
    print("To ship your package with ground shipping it will cost:")
    print(price)

else:
    price = (weight * 4.75) + groundshipping_flat 
    print("To ship your package with ground shipping it will cost:")
    print(price)

#Ground Shipping Premium
groundshipping_premium = 125.00
print("To ship with Ground shipping Premium it will cost")
print(groundshipping_premium)