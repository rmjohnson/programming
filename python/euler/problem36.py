def b(x):
    binary = []
    while x >= 1:
        remainder = x % 2
        binary.append(str(remainder))
        x = x/2
    result = ''.join(binary)
    return result[::-1]

def p(x):
    strx = str(x)
    lenx = len(strx)
    i = 1
    while i <= lenx/2:
        if strx[i-1] != strx[-i]:
            return "F"
        i += 1
    return "T"

total = 0
x = 0
while x < 1000000:
    if p(x) == "T" and p(b(x)) == "T":
        total += x
    x += 1
print total

"""
Bravo, kritstov! Now that you have solved 25 problems you have achieved what
79.49% of members have failed to do and have advanced to level 1. Good luck
as you continue.

BOO YAH!
"""
