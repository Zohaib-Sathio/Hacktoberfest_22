looping = True
while looping :
	pass
	number1 = int(input("Enter first number for operation: "))
	number2 = int(input("Enter first number for operation: "))
	operator = input("Enter the operation you want to perform: ")
	

	if operator is '+':
		print(number1+number2)
	elif operator is '-':
		print(number1-number2)
	elif operator is '*':
		print(number1*number2)
	elif operator is '/':
		if number2 is not 0:
			print(number1/number2)
		else:
			print("2nd number is zero so it can not be divided. Try again.")

	else:
		print("operator invalid.")
	
	ask = input("Do you want to continue? (yes/no) ")

	if ask =="yes":
		looping = True
	else:
		looping = False
