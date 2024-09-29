num = int(input("Enter the Number: "))
a = 0
b = 1
print(a,b,end = " ")
while count<num:
    c = a+b
    print(c, end = " ")
    a = b
    b = c
    count = count+1