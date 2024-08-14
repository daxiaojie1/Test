# 读取输入的两个浮点数
a, b = map(float, input().split())

# 计算余数，确保余数是非负的
r = a % b

# 如果余数为负，转换为正数
if r < 0:
    r += b

# 输出余数，不保留小数点后的多余0
print(f"{r:g}")