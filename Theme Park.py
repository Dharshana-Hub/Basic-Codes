print("WELCOME TO WONDERLA!!")

print("Escape Reality, Enter Fun!")

Age = int(input("Enter Your Age: "))
if 18<=Age<=60:
    print("You are allowed")
    print("Enjoy the rides")
elif Age<18:
    Permission = str(input("Get Permission from your Parents...Enter either Yes or No: "))
    if Permission=="Yes":
        print("Enjoy the rides")
    elif Permission=="No":
       print("You are not allowed")
    else:
       print("Check the input")
else:
    print("We're Sorry .. Senior Citizens are not allowed")
