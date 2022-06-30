

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

    def enroll(self):
        if self.is_rewards_member != True:
            self.is_rewards_member = True
            self.gold_card_points = 200
        else:
            print("User already a member.")
            return False

    def spend_points(self, amount):
        if self.gold_card_points > amount:
            print("You don't have enough points to spend")
        else:
            self.gold_card_points -= amount


# Testing display_info
user_peter = user("Peter", "Mateo", "p305127@icloud.com", 21)

user_peter.display_info()

# Testing Enroll
user_peter.enroll()
print("--------------------------")
user_peter.enroll()
