

weight = 4.8
groundshipping_flat = 20
droneship_flat = 0

#Ground Shipping
if weight <= 2:
    price = str(round((weight * 1.50) + groundshipping_flat, 2)) 
    print("To ship your package with ground shipping it will cost:")
    print(price)

elif weight > 2 and weight <= 6:
    price = str(round((weight * 3.00) + groundshipping_flat,2)) 
    print("To ship your package with ground shipping it will cost:")
    print(price)

elif weight > 6 and weight <= 10:
    price = str(round((weight * 4.00) + groundshipping_flat, 2)) 
    print("To ship your package with ground shipping it will cost:")
    print(price)

else:
    price = str(round((weight * 4.75) + groundshipping_flat, 2)) 
    print("To ship your package with ground shipping it will cost:")
    print(price)

#Ground Shipping Premium
groundshipping_premium = 125.00
print("To ship with Ground shipping Premium it will cost")
print(groundshipping_premium)

#Drone Shipping
if weight <= 2:
    price = str(round((weight * 4.50) + droneship_flat, 2))
    print("To ship your package with Drone shipping it will cost:")
    print(price)

elif weight > 2 and weight <= 6:
    price = str(round((weight * 9.00) + droneship_flat,2))
    print("To ship your package with Drone shipping it will cost:")
    print(price)

elif weight > 6 and weight <= 10:
    price = str(round((weight * 12.00) + droneship_flat, 2))
    print("To ship your package with Drone shipping it will cost:")
    print(price)
else:
    price = str(round((weight * 14.25) + droneship_flat, 2))
    print("To ship your package with Drone shipping it will cost:")
    print(price)