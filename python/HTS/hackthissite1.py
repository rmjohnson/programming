def dumb_hash(word):
    wordvalue = 1
    for x in range(len(word)):
        wordvalue *= ord(word[x])
    return wordvalue

f = open('wordlist.txt','r')
inp = open('inputlist.txt','r')
inplist = []
wordlist = []
valuelist = []
solutionlist = []
solutionstring = ''

#Generate the lists
for line in f:
    wordlist.append(line.replace('\n',''))
for line in inp:
    inplist.append(line.replace('\n',''))
    
#Hash the word list and the input list
for i in range(len(wordlist)):
    word = wordlist[i]
    valuelist.append(dumb_hash(word))
for i in range(len(inplist)):
    # First you grab the word (inp[i]) then you apply the dumb hash.
    # After that you find the hash value in the value list and then connect
    # that to the word list and append it to the solution list.
    solutionlist.append(wordlist[valuelist.index(dumb_hash(inplist[i]))])

solutionstring = ','.join(solutionlist)
print solutionstring
