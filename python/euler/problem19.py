def check(d):
    if d[0] == "S" and d[2] == 1:
        return "T"
    else:
        return "F"
    
def monthdays(m,y):
    if m == "Jan" or m == "Mar" or m == "May" or m == "Jul" or m == "Aug" or m == "Oct" or m == "Dec":
        return 31
    if m == "Feb" and y == 2000:
        return 29
    elif m == "Feb":
        if y % 4 == 0 and y % 100 != 0:
            return 29
        else:
            return 28
    if m == "Sep" or m == "Apr" or m == "Jun" or m == "Nov":
        return 30

count = 0
days = ["S","M","T","W","Th","F","Sa"]
months = ["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"]
day = ["T","Jan",1,1901]

while day[3] <= 2000:
    #if day[2] == 1 and day[3] == 2000:
        #print day
    #if day[2] == monthdays(day[1],day[3]) and day[3] == 2000:
        #print day
    if day[0] == "Sa":
        day[0] = "S"
    else:
        day[0] = days[days.index(day[0])+1]
    if day[2] == monthdays(day[1],day[3]):
        day[2] = 1
        if day[1] == "Dec":
            day[1] = "Jan"
            day[3] += 1
        else:
            day[1] = months[months.index(day[1])+1]
    else:
        day[2] += 1
    if check(day) == "T":
        print day[1],
        print day[3]
        count += 1
print count

