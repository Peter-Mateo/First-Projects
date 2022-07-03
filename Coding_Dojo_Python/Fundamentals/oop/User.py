

class user:
    def __init__(self, first, last, email, age):
        self.first_name = first
        self.last_name = last
        self.email = email
        self.age = age
        self.is_rewards_member = False
        self.gold_card_points = 0
        

    def display_info(self):
        print(self.first_name)
        print(self.last_name)
        print(self.email)
        print(self.age)
        print(self.is_rewards_member)
        print(self.gold_card_points)
        return self

    def enroll(self):
        if self.is_rewards_member != True:
            self.is_rewards_member = True
            self.gold_card_points = 200
            return self
        else:
            print("User already a member.")
            return False

    def spend_points(self, amount):
        if self.gold_card_points > amount:
            print("You don't have enough points to spend")
            return self
        else:
            self.gold_card_points -= amount
            return self


# Testing display_info
user_peter = user("Peter", "Mateo", "p305127@icloud.com", 21)

user_peter.display_info().enroll().enroll()

# Testing Enroll (- Practicing Chaining Methods - )
#user_peter.enroll()
#print("--------------------------")
#user_peter.enroll()


#2 More Instances of User class
user_leo = user("Leo", "Mateo", "leom305131@gmail.com", 21)
user_steven = user("Steven", "Mateo", "stevenmateooo@gmail.com", 24)

#User Spending (- Practicing Chaining Methods - )
user_leo.spend_points(50)
print("--------------------------")
user_steven.enroll().spend_points(80)
#user_steven.spend_points(80)
print("--------------------------")

#Calling the DisplayInfo 
user_leo.display_info()
print("--------------------------")
user_steven.display_info()
print("--------------------------")
user_peter.display_info()