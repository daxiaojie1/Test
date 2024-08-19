c = int(input())
k =[2, 3, 4, 5, 6, 7, 8, 9]
divisors = ""
for K in k:
    if c % K == 0:
        if divisors:
            divisors += " "
        divisors += str(K)
if divisors:
    print(divisors)
else:
    print("none")
