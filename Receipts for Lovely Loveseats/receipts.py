#Declarations of Variables
lovely_loveseat_description = "Lovely Loveseat. Tufted polyester blend on wood. 32 inches high x 40 inches wide x 30 inches deep. Red or white."
lovely_loveseat_price = 254.00
stylish_settee_description = "Stylish Settee. Faux leather on birch. 29.50 inches high x 54.75 inches wide x 28 inches deep. Black."
stylish_settee_price = 180.50
luxurious_lamp_description = "luxurious Lamp. Glass and iron. 36 inches tall. Brown with cream shade. "
luxurious_lamp_price = 52.15
#Taxes = 8.8%
sales_tax = .088
customer_one_total = 0 
#Creation of String (Cart - Details)
customer_one_itemization = " "
#Choosing Items
customer_one_total += lovely_loveseat_price 
customer_one_itemization += lovely_loveseat_description 
customer_one_total += luxurious_lamp_price 
customer_one_itemization += luxurious_lamp_description 
#Multiplying to add the taxes to the customer reciept
customer_one_tax = customer_one_total * sales_tax 
customer_one_total += customer_one_tax 
#Rounding 
customer_one_tax = str(round(customer_one_tax, 2))
customer_one_total = str(round(customer_one_total, 2))
#Print out the Itemized Reciept
print("Customer One Items:")
print(customer_one_itemization)
#Print Included Taxes 
print("Included Taxes")
print(customer_one_tax)
#Print Total 
print("Customer One Total:")
print(customer_one_total) 


