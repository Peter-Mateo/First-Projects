class Player:
    def __init__(self, name, age, position, team):
        self.name = name
        self.age = age
        self.position = position
        self.team = team 


kevin = {
    	"name": "Kevin Durant", 
    	"age":34, 
    	"position": "small forward", 
    	"team": "Brooklyn Nets"
}
jason = {
    	"name": "Jason Tatum", 
    	"age":24, 
    	"position": "small forward", 
    	"team": "Boston Celtics"
}
kyrie = {
    	"name": "Kyrie Irving", 
    	"age":32, "position": "Point Guard", 
    	"team": "Brooklyn Nets"
}
    
# Create your Player instances here!
# player_jason = ???

kevin_player = Player(kevin["name"], kevin["age"], kevin["position"], kevin["team"])

jason_player = Player(jason["name"], jason["age"], jason["position"], jason["team"])

kyrie_player = Player(kyrie["name"],kyrie["age"],kyrie["position"],kyrie["team"])


