def digit(x):
    if x == "0":
        return 0
    if x == "1":
        return 3
    if x == "2":
        return 3
    if x == "3":
        return 5
    if x == "4":
        return 4
    if x == "5":
        return 4
    if x == "6":
        return 3
    if x == "7":
        return 5
    if x == "8":
        return 5
    if x == "9":
        return 4

def weird(x):
    strx = str(x)
    if x == 10:
        return 3
    elif x == 11:
        return 6
    elif x == 12:
        return 6
    elif x == 13:
        return 8
    elif x == 15:
        return 7
    elif x > 13 and x < 20:
        return digit(strx[1]) + 4
    elif x == 20:
        return 6
    elif x > 20 and x < 40:
        count = 9
        if strx[1] != "0":
            count += digit(strx[1])
        return count
    elif x > 50 and x < 70:
        count = 5
        if strx[1] != "0":
            count += digit(strx[1])
        return count
    elif strx[1] == "0" and strx[0] != "0":
        return digit(strx[0]) + 2
    elif strx[0] == "0" and strx[1] == "0":
        return 0
    else:
        return int(digit(strx[0])) + int(digit(strx[1]))

def letters(x):
    count = 0
    strx = str(x)
    if len(strx) == 3:
        count += 10 + digit(strx[0]) + weird(strx[-2:])
    if len(strx) == 2:
        count += weird(int(strx))
    if len(strx) == 1:
        count += digit(strx)
    return count

print letters(922)
print len("ninehundredandtwentytwo")

def main():
    x = 1
    total = 0
    while x <= 999:
        total += letters(x)
        print x
        x += 1
    total += 11
    print total
main()

