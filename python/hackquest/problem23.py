cryptpass = "Bbkwho"
challpass = ""

for i in range(0,6):
    cryptchar = ord(cryptpass[i])
    if (i%2):
        cryptchar -= 1
    else:
        cryptchar += 1
    challpass += chr(cryptchar)
print challpass


