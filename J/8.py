num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

sum = num1 + num2

result = str(sum).lstrip('0')

print(result if result else '0')