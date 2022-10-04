number = int(input("Enter number: "))  
  
nmb = 0  
 
while (number > 0):   
    remainder = number % 10  
    nmb = (nmb * 10) + remainder  
    number = number // 10  
   
print("The reverse number is : {}".format(nmb))  