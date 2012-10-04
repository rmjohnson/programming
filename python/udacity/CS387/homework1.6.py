def factorial(n):
    if n==0:
        return 1
    else:
        return n * factorial(n-1)

x = 5
while(26**x < factorial(26)):
    x+=1
print x
