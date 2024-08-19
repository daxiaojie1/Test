# n = list(map(int,input().split()))
# print(f"{n[0] * 28.9 + n[1] * 32.7 + n[2] * 45.6 + n[3] * 78 + n[4] * 35 + n[5] * 86.2 + n[6] * 27.8 + n[7] * 43 + n[8] * 56 + n[9] * 65:.1f}")


prices = {
    "计算概论": 28.9,
    "数据结构与算法": 32.7,
    "数字逻辑": 45.6,
    "C++程序设计教程": 78,
    "人工智能": 35,
    "计算机体系结构": 86.2,
    "编译原理": 27.8,
    "操作系统": 43,
    "计算机网络": 56,
    "JAVA程序设计": 65
}
# quantities = list(map(int, input().split()))
# total_cost = 0
# for book, quantity in zip(prices.keys(), quantities):
#     total_cost += prices[book] * quantity
# print(f"{total_cost:.1f}")


for book in prices.keys():
    print(prices[book])