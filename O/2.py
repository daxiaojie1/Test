sigma = 0; #sigma就是数学里的平均数
for i in range(12):
    sigma += float(input())
print("%.2f" % (sigma /12))