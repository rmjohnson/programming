x = 2
seq = []
while x <= 100:
    y = 2
    while y <= 100:
        num = x ** y
        if num not in seq:
            seq.append(num)
        y += 1
    x += 1
print len(seq)
