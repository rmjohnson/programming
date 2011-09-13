#MAKE SURE TO CHANGE THE DATE YOU IDIOT
date = 2
ref = "0123456789abcdefghijklmnopqrstuvwxyz._~ABCDEFGHIJKLMNOPQRSTUVWXYZ"
temp = raw_input("Encrypted string: ")
origstring = ""
for i in range(len(temp)):
    cipher = ref.find(temp[i])
    conv = cipher^date
    origstring += ref[conv]
print origstring
