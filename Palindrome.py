num = int(input("Enter a number: "))
copy = num
a = 0
b = 0
while copy!=0:
    a = copy%10
    b = (b*10)+a
    copy = copy//10
if num==b:
    print("The given number is a Palindrome")
else:
    print("The given number is not a Palindrome")