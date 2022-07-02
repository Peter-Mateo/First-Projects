"""
The Challenge --

Count the number of words provided. For this problem, a word is any sequence of lowercase letters. For example, hello is a word, but so are non-English "words" like bbaabbb. 

Input --

The input is one line of text, consisting of lowercase letters and spaces. There is exactly one space between each pair of words, and there are no spaces before the first word or after the last word. The maximum length of the line is 80 characters. 

Output --

Output the number of words in the input line. 

"""

import random

x = random.choice(1, 9)

if x == 1:
    number = "lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim adipiscing"
    print(number)
    print("================================")
    print(number.count(" " + 1))

elif x == 2:
    print("aabbbaa bbbaaaccd  kdkljfls slkfjwoiur oaskj")
    print("================================")
    print(number.count(" " + 1))

elif x == 3:
    print("lkjf lskjfdl lkjf")
    
elif x == 4:
    print("hello bbbaaaccd")

elif x == 5:
    print("lkjf")

elif x == 6:
    print("lkjd lskdjflskdjflksldfkj ljkjfk lkjdflkjlj soiuroiuow")

elif x == 7:
    print("lksjf kljk")

elif x == 8:
    print("lkjsfoidjs bbbaaaccd  kdkljfls slkfjwoiur oaskj lksdjflj lskjflak  lsjfkllk lkdjfl ljouworiuoi qoisauoiaiyoiy oiauoifpeopru oicuoiuaoiuor")

elif x == 9:
    print("a")

