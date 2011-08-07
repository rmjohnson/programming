f = open('names.txt','r')
strnames = f.read()
names = strnames.split("\",\"")
names.sort()

def value(name):
    x = 0
    alphabet = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    value = 0
    while x < len(name):
        value += alphabet.find(name[x])
        x += 1
    return value

x = 0
total = 0
while x < len(names):
    total += (value(names[x]) * (x + 1))
    x += 1
print total

