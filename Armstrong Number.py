num = int(input("Enter a number: "))
copy=num
copy1=num
b=0
count=0
while copy1 !=0:
    count=count+1
    copy1=copy1//10
while num!=0:
    a = num%10
    b=b+a**count
    num = num//10
print(b)
if copy==b:
    print("The given number is an armstrong number")
else:
    print("The given number is not an armstrong number")