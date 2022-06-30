

class user:
    def __init__(self, first, last, email, age):
        self.first_name = first
        self.last_name = last
        self.email = email
        self.age = age
        self.is_rewards_member = False
        self.gold_card_points = 0

    def display_info(self):
        print()
    def enroll(self):
        if user.is_rewards_member != True:
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