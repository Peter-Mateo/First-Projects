
for i in range(1):
    x = 0
    for i in range(150):
        x = x + 1
        print(x)

print("--------------------------")

for i in range(1):
    a = 0
    for i in range(200):
        a = a + 5
        print(a)

print("--------------------------")

for i in range(1):
    x = 0 
    for i in range(100):
        x = x + 1
        if x == 0:
            print("0")
        elif x%10 == 0:
            print("Coding Dojo")
        elif x%5 == 0:
            print("Coding")
        else:
            print(x)

print("--------------------------")

for i in range(1):
    x = 1 
    z = 1
    while x < 500000:
        z = z + x
        x = x + 2
    print(z)

print("--------------------------")

for i in range(1):
    x = 2018
    while x >= 2:
        print(x)
        x = x - 4

print("--------------------------")

lowNum = 1
highNum = 20
mult = 3 
for i in range(lowNum, highNum):
    if i%3 == 0:
        print(i)