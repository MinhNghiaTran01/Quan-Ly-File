

t = int(input())
while t>0:
    t-=1
    n = int(input())
    check = False
    if n%7==0:
        print(n)
        continue
    for i in range(0,1000):
        if(n<9):
            n+=n
        else:
            s = str(n)
            s = s[::-1]
            tmp = int(s)
            n += tmp
            if(n%7==0):
                print(n)
                check = True
                break
    if(check==False):
        print(-1)