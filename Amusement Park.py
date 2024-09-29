print("WELCOME TO THRILLTOPIA!!")
print("Where every ride is an adventure!")

Options = ["Display All Details : ", "UNLIMITED JOY CARD", "Play Rides", "Exit"]
Balance = 1200
Age = int(input("Enter Your Age : "))


if 18 <= Age <= 60:
    print("You are allowed")
    print("Enjoy the rides")
    while True:
        print(Options)
        Choose = str(input("Enter any of the above : "))

        if Choose == Options[3]:
            print("Thank you so much .. Can't stop the thrill ... See you soon!!")
            break

        elif Choose == Options[0]:
            print("Cost for Park for Senior Citizens and Children : 100rs Per hour")
            print("Cost for All Rides : 800rs")
            print("Cost for all Non-Water Rides : 500rs")
            print("----------------------------------------------------------------")

        elif Choose == Options[1]:
            Customer_Choice = str(input("Do you already have UNLIMITED JOY CARD? : "))
            if Customer_Choice == "Yes":
                for i in range(3):
                    AccNo = int(input("Enter your Account Number: "))
                    TempAccNo = AccNo
                    Count = 0

                    while TempAccNo != 0:
                        TempAccNo = TempAccNo//10
                        Count = Count + 1

                        if Count == 8:
                            for j in range(3):
                                Password = int(input("Enter the Password: "))
                                TempPassword = Password
                                Count1 = 0

                                while TempPassword != 0:
                                    TempPassword = TempPassword//10
                                    Count1 = Count1 + 1

                                    if Count1 == 4:
                                        print("Welcome UNLIMITED JOY CARD ACCOUNT!")
                                        break
                        
                                    else:
                                        print("Incorrect Password")

                                if Count1 == 4:
                                    break
                        
                                else:
                                    print("Failed to proceed after 3 attempts")
                        else:
                            print("Invalid Account Number")

                        if Count != 8 or Count1 != 4:
                            print("Failed to proceed after 3 attempts")
                        else:
                            Options_1 = ["Check_Balance", "Top-Up", "Swipe to play rides", "Exit"]
                            while True:
                                print(Options_1)
                                Select = str(input("Select any of the above given : "))

                                if Select == Options_1[0]:
                                    print("Your UNLIMITED JOY ACCOUNT BALANCE is" + " " + ":" + " " + str(Balance) + "rs")

                                elif Select == Options_1[1]:
                                    for i in range(3):
                                        PIN = int(input("Enter your PIN number: "))
                                        Count2 = 0
                                        CurPin = PIN

                                        while CurPin != 0:
                                            CurPin = CurPin//10
                                            Count2 = Count2+1
                
                                            if Count2 == 4:
                                                FirstPackage_string = "Cost for Park for Senior Citizens and Children : 100rs Per hour"
                                                SecondPackage_string = "Cost for All Rides : 800rs"
                                                ThirdPackage_string = "Cost for all Non-Water Rides : 500rs"
                                                print(FirstPackage_string + " " + SecondPackage_string + " " + ThirdPackage_string + " " + "----------------------------------------------------------------")
                                            
                                                Package = str(input("Choose any of the above listed packages : "))
                                                
                                                if Package == SecondPackage_string:
                                                    print("You are expected to pay" + " " + "800rs" + " " + "to enjoy All the Rides")
                                                    Cash_1 = int(input("Enter the Cash : "))
                                                    if Cash_1%100 == 0:
                                                        Balance = Balance + Cash_1
                                                        print(str(Cash_1) + " " + "rs" + " " + "has been successfully credited to your UNLIMITED JOY CARD ACCOUNT!")
                                                        print("Your Balance : " + str(Balance) + " " + "rs")
                                                        print("You can now enjoy the rides")
                                                        break
                                                    else:
                                                        print("Please enter the cash only in the multiples of 100")
                                                        break
                                                elif Package == ThirdPackage_string:
                                                    print("You are expected to pay" + " " + "500rs" + " " + "to enjoy all the Non-Water Rides")
                                                    Cash_2 = int(input("Enter the Cash : "))
                                                    if Cash_2%100 == 0:
                                                        Balance = Balance + Cash_2
                                                        print(str(Cash_2) + " " + "rs" + " " + "has been successfully credited to your UNLIMITED JOY CARD ACCOUNT!")
                                                        print("Your Balance : " + str(Balance) + " " + "rs")
                                                        print("You can now enjoy the rides")
                                                        break
                                                    else:
                                                        print("Please enter the cash only in the multiples of 100")
                                                        break
                                            else:
                                                print("Incorrect PIN")
                                            if Count2 != 4:
                                                print("Maximum Attempts reached ... Please try again after sometime")
                                                break

                                elif Select == Options_1[3]:
                                    print("Your Balance : " + str(Balance) + " " + "rs")
                                    print("Thank you so much ... Can't stop the thrill ... See you soon!!")

                                elif Select == Options_1[2]:
                                    Rides = ["Roller Coaster", "Dragon Swing", "Thrill Tooper", "Big Wheels", "Wave Swinger", "Revolution", "Twister", "Carousel"]
                                    Cost = ["100rs", "100rs", "100rs", "100rs", "100rs", "100rs", "100rs", "100rs"]
                                    print(Rides)
                                    print(Cost)
                                    for k in range(3):
                                        Play_Ride = str(input("Select any of the ride you wanted to thrill : "))
                                        if Play_Ride == Rides[0] or Rides[1] or Rides[2] or Rides[3] or Rides[4] or Rides[5] or Rides[6] or Rides[7]:
                                            print("You are expected to pay" + " " + "100rs" + " " + "to enjoy the " + Play_Ride)
                                        else:
                                            print("Please enter a proper input.")     
                                            PIN = int(input("Enter your PIN number : "))
                                            Count3 = 0
                                            TempPin =  PIN

                                            while TempPin != 0:
                                                TempPin = TempPin//10
                                                Count3 = Count3 + 1

                                                if Count3 == 4:
                                                    Amt = int(input("Enter the Amount in rupees : "))
                                                    if Amt <= Balance:
                                                        print("Here you go :" + " " + str(Amt) + " " + "rs")
                                                        print("Transaction Successful")
                                                        print("You can now experience the thrill!!!")
                                                        Balance = Balance - Amt
                                                        print("Your Balance :" + " " + str(Balance) + "rs")
                                                        break
                                                    elif Amt > Balance:
                                                        print("Insufficient Balance")
                                                        print("Your Balance :" + " " + str(Balance) + " " + "rs")
                                                        break
                                                else:
                                                    print("Incorrect PIN")
                                            if Count3 != 4:
                                                print("Maximum Attempts reached. Transaction Failed")
                                                break
            elif Customer_Choice == "No":
                print("To create a new UNLIMITED JOY CARD ACCOUNT ... Please enter the below credentials.")
                UAN = int(input("Please enter an account number : "))
                if len(str(UAN)) == 8:
                    UAP = int(input("Please enter a password : "))
                    if len(str(UAP)) == 4:
                        print("Your UNLIMITED JOY CARD ACCOUNT has been successfully created.")
                    else:
                        print("Please enter a 4-Digit Password")
                else:
                    print("Please enter a 8-Digit Acoount Number")
        elif Choose == Options[2]:
            Rides_1 = ["Roller Coaster", "Dragon Swing", "Thrill Tooper", "Big Wheels", "Wave Swinger", "Revolution", "Twister", "Carousel"]
            Cost_1 = ["100rs", "100rs", "100rs", "100rs", "100rs", "100rs", "100rs", "100rs"]
            print(Rides_1)
            print(Cost_1)
            for m in range(3):
                Play_Ride = str(input("Select any of the ride you wanted to thrill : "))
                                        
                if Play_Ride == Rides_1[0] or Rides_1[1] or Rides_1[2] or Rides_1[3] or Rides_1[4] or Rides_1[5] or Rides_1[6] or Rides_1[7]:
                    print("You are expected to pay" + " " + "100rs" + " " + "to enjoy the " + Play_Ride)
                else:
                    print("Please enter a proper input.")     
                    PIN_1 = int(input("Enter your PIN number : "))
                    Count4 = 0
                    Temp_Pin =  PIN_1

                    while Temp_Pin != 0:
                        Temp_Pin = Temp_Pin//10
                        Count4 = Count4 + 1

                        if Count4 == 4:
                            Amt_1 = int(input("Enter the Amount in rupees: "))
                            if Amt_1 <= Balance:
                                print("Here you go:" + " " + str(Amt) + " " + "rs")
                                print("Transaction Successful")
                                print("You can now experience the thrill!!!")
                                Balance = Balance - Amt_1
                                print("Your Balance:" + " " + str(Balance) + "rs")
                                break
                            elif Amt_1 > Balance:
                                print("Insufficient Balance")
                                print("Your Balance:" + " " + str(Balance) + " " + "rs")
                                break
                        else:
                            print("Incorrect PIN")
                            if Count4 != 4:
                                print("Maximum Attempts reached. Transaction Failed")
                                break
            else:
                print("Invalid Option ... Please enter a proper input.")
elif Age<18:
    print("We're Sorry ... Children below 18 aren't allowed for rides ... Instead you can enjoy in the park.")
    Members_SC1 = int(input("Enter the No.Of.Senior Citizens : "))
    Members_Chi1 = int(input("Enter the No.Of.Children : "))
    Time_1 = int(input("Enter the No.Of.Hours : "))
    PerHour_Cost1 = int(100)
    Total_Members1 = Members_SC1 + Members_Chi1
    Park_Cost1 = Time_1*Total_Members1*PerHour_Cost1
    print("You are expected to pay" + " " + str(Park_Cost1) + " " + "rs" + " " + "to stay in the park")
    Cash_3 = int(input("Enter the Cash: "))
    Balance = 1200
    if Cash_3%100 == 0:
        Balance = Balance + Cash_3
        print(str(Cash_3) + " " + "rs" + " " + "has been successfully credited to your UNLIMITED JOY CARD ACCOUNT!")
        print("Your Balance: " + str(Balance) + " " + "rs")
        print("You can now enjoy your pleasant time in the park!")

    else:
        print("Please enter the cash only in the multiples of 100")


elif Age>60:
    print("We're Sorry ... Adults above 60 aren't allowed for rides ... Instead you can spend a good time in the park.")
    Members_SC2 = int(input("Enter the No.Of.Senior Citizens : "))
    Members_Chi2 = int(input("Enter the No.Of.Children : "))
    Time_2 = int(input("Ennter the No.Of.Hours : "))
    PerHour_Cost2 = int(100)
    Total_Members2 = Members_SC2 + Members_Chi2
    Park_Cost2 = Time_2*Total_Members2*PerHour_Cost2
    print("You are expected to pay" + " " + str(Park_Cost2) + " " + "rs" + " " + "to stay in the park")
    Cash_4 = int(input("Enter the Cash : "))

    if Cash_4%100 == 0:
        Balance = Balance + Cash_4
        print(str(Cash_4) + " " + "rs" + " " + "has been successfully credited to your UNLIMITED JOY CARD ACCOUNT!")
        print("Your Balance: " + str(Balance) + " " + "rs")
        print("You can now enjoy your pleasant time in the park!")
    else:
        print("Please enter the cash only in the multiples of 100")
   
else:
    print("Please enter an appropriate age")
    