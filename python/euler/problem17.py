def lettercount(x):
    count = 0
    y = 0
    strx = str(x)
    while y <= len(strx):
        if int(strx) == 1:
            count += 3
        if int(strx) == 2:
            count += 3
        if int(strx) == 3:
            count += 5
        if int(strx) == 4:
            count += 4
        if int(strx) == 5:
            count += 4
        if int(strx) == 6:
            count += 3
        if int(strx) == 7:
            count += 5
        if int(strx) == 8:
            count += 5
        if int(strx) == 9:
            count += 4
        if int(strx) == 10:
            count += 3
        if int(strx) == 11:
            count += 6
        if int(strx) == 12:
            count += 6
        if int(strx) > 12 and int(strx) < 20:
            count += 4
            strx.replace('1','')
        if int(strx) => 20 and int(strx) < 30:
            count += 6
            strx.replace('2','')
        if int(strx) => 30 and int(strx) < 40:
            count += 6
            strx.replace('3','')
        if int(strx) > 40 and int(strx) < 50:
            count += 6
            strx.replace('4','')
        if int(strx) > 50 and int(strx) < 60:
            count += 5
            strx.replace('5','')
        if int(strx) > 60 and int(strx) < 70:
            count += 5
            strx.replace('6','')
        if int(strx) > 70 and int(strx) < 80:
            count += 7
            strx.replace('7','')
        if int(strx) > 80 and int(strx) < 90:
            count += 6
            strx.replace('8','');
        if int(strx) > 90 and int(strx) < 100:
            count += 6
            strx.replace('9','');
        if int(strx) > 100 and int(strx) < 200:
            count += 6
            strx.replace('4','');

total = 0
