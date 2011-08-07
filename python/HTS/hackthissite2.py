import Image

def morse_trans(l):
    morse = ['.-','-...','-.-.','-..','.','..-.','--.','....','..','.---','-.-','.-..','--','-.','---','.--.','--.-','.-.','...','-','..-','...-','.--','-..-','-.--','--..','.----','..---','...--','....-','.....','-....','--...','---..','----.','-----']
    alphabet = 'a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,1,2,3,4,5,6,7,8,9,0'.split(',')
    solution = ''
    for i in range(len(l)):
        solution += alphabet[morse.index(l[i])]
    return solution

im = Image.open("Image.png")
data = list(im.getdata())
solution_morse = ""
final_solution = ""
last_i = 0

for i in range(len(data)):
    if data[i] == 1:
        solution_morse += chr(i-last_i)
        last_i = i
     
final_solution = morse_trans(solution_morse.strip().split(' '))
print final_solution
