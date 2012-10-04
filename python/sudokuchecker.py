#Checks if a completed puzzle is correct.
p =      [[5,3,4,6,7,8,9,1,2],
          [6,7,2,1,9,5,3,4,8],
          [1,9,8,3,4,2,5,6,7],
          [8,5,9,7,6,1,4,2,3],
          [4,2,6,8,5,3,7,9,1],
          [7,1,3,9,2,4,8,5,6],
          [9,6,1,5,3,7,2,8,4],
          [2,8,7,4,1,9,6,3,4],
          [3,4,5,2,8,6,1,7,9]]
def check_rows(puzzle):
    for x in range(0,8):
        temp = []
        for y in range(0,8):
            if puzzle[x][y] in temp:
                return False
            else:
                temp.append(puzzle[x][y])
    return True
def check_columns(puzzle):
    for y in range(0,8):
        temp = []
        for x in range(0,8):
            if puzzle[x][y] in temp:
                return False
            else:
                temp.append(puzzle[x][y])
    return True
def check_blocks(puzzle):
    i = 1
    ii = 1
    temp = []
    x = i-1
    y = ii-1
    while x < i*3:
        while y < ii*3:
            if puzzle[x][y] in temp:
                return False
            else:
                temp.append(puzzle[x][y])
        
                
