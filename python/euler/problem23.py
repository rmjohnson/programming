"""
#Sum of proper divisors function
def sofd(x):
    divisors = []
    i = 1
    while i <= x/2:
        if x % i == 0:
            divisors.append(str(i))
        i += 1
    i = 0
    total = 0
    while i < len(divisors):
        total += int(divisors[i])
        i += 1
    return total

#Abundant function
def a():
    abundantnums = []
    #12 is the smallest abundant number
    x = 11
    while x < 29000:
        if x < sofd(x):
            abundantnums.append(x)
        x += 1
    return abundantnums
print a()
"""

filename = "abundantnums.txt"
f = open(filename, "r")
strnums = f.read()
a = strnums.split(", ")
f.close()

"""
x = 24
#By mathematical analysis, it can be shown that all integers greater than
#28123 can be written as the sum of two abundant numbers.
limit = 28123
total = 0
closest = x
while x < limit:
    i = 0
    if str(x) == a[a.index(str(closest)) + 1]:
        closest = x
    if a[i] < x/2:
        minimum = i
    else:
        minimum = 0
    maximum = a.index(str(closest))
    while i < a.index(str(closest)):
        if str(x - int(a[i])) in a[minimum:maximum]:
            #print x,
            break
        else:
            i += 1
    if str(x - int(a[i])) not in a[minimum:maximum]:
        print x,
        total += x
    #else:
        #print x,
    #print x,
    x += 2
#total += 395465626
print total

"""
"""
nums = []
n = 24
i = 0
ii = 0
iii = 0
total = 0

while n <= 28123:
    nums.append(n)
    n += 1

while i < len(a):
    ii = i
    print a[i],
    while ii < len(a):
        num = int(a[i])+int(a[ii])
        if num > nums[0]:        
            if num in nums:
                nums.remove(num)
        if num > nums[-1]:
            break
        ii += 1
    i += 1
print
while iii < len(nums):
    total += nums[iii]
    iii += 1
print "SOLUTION:"
print total
"""
