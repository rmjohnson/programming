import string

def onedigit (num):
    letter = str(num)
    new = string.translate(letter,string.maketrans('0123456789','0335443554'))
    return int(new)

def twodigit (num):
    word = str(num)
    if (word[0] != '1'):
        new = int(string.translate(word[0],string.maketrans('023456789','066555766')))
        new = new + onedigit(word[1])
        return new
    else:
        new = int(string.translate(word[1],string.maketrans('0123456789','3668877988')))
        return new
    
def threedigit(num):
    word = str(num)
    new = int(string.translate(word[0],string.maketrans('123456789','335443554')))
    new += 7
    if word[1:3] != "00":
        new += 3
    new += int(twodigit(word[1:3]))
    return new

def main():
    x = 1
    total = 0
    while x <= 999:
        if len(str(x)) == 3:
            total += threedigit(x)
            print threedigit(x), x
        if len(str(x)) == 2:
            total += twodigit(x)
            print twodigit(x), x
        if len(str(x)) == 1:
            total += onedigit(x)
            print onedigit(x), x
        x += 1
    total += 11 #one thousand
    print total
main()
