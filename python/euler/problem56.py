a = 1
b = 1
biggest = 0
while a < 100:
    print a,
    b = 1
    while b < 100:
        i = 0
        result = str(a ** b)
        total = 0
        while i < len(result):
            total += int(result[i])
            i += 1
        if total > biggest:
            biggest = total
        b += 1
    a += 1
print biggest
