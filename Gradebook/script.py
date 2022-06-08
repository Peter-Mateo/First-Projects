last_semester_gradebook = [["politics", 80], ["latin", 96], ["dance", 97], ["architecture", 65]]

subjects = ["physics", "calculus", "poetry", "history"]
grades = [98, 97, 85, 88]

#Two dimensional List
gradebook = [["physics", 98], ["calculus", 97], ["poetry", 98], ["history", 88]] 

#Test 
print(gradebook)

#Adding to a list
gradebook.append(["computer science", 100])
gradebook.append(["visual arts", 93])

#Test
print(gradebook)

#Modifying the 2D list
gradebook[-1][-1] = 98
gradebook[2].remove(98)
gradebook[2].append("Pass")

#Combination
full_gradebook = last_semester_gradebook + gradebook

#Test
print(full_gradebook)
