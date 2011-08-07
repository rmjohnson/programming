def prime(n):
    for x in range(2, int(int(n)**0.5)+1):
        if int(n) % x == 0:
            return "F"
    return "T"

def circle(n):
    string = str(n)
    for y in range(len(string)):
        newstring = ""
        for x in range(len(string)):
            newstring += string[x-y]
        if prime(newstring) == "F":
            return "F"

count = 0
x = 2
while x <= 1000000:
    if prime(x) != "F":
        if circle(x) != "F":
            print x
            count += 1
    x += 1
print count
