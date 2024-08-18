# apple_height = list(map(int,input().split()))
# tao_tao_reach = int(input()) + 30
# count = 0
# for height in apple_height:
#     if height <= tao_tao_reach:
#         count += 1
# print(count)


# 读取苹果的高度列表
apples_heights = list(map(int, input().split()))

# 读取陶陶把手伸直时能够达到的最大高度
tao_tao_reach = int(input()) + 30

# 计算陶陶能够摘到的苹果数目
# 当苹果高度低于或等于陶陶伸手能达到的高度时，计数加1
count = sum(1 for height in apples_heights if height <= tao_tao_reach)

# 输出陶陶能够摘到的苹果数目
print(count)