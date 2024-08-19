L, M = list(map(int, input().split()))
trees = [1] * (L + 1)
for _ in range(M):
    start, end = map(int, input().split())
    for i in range(start, end+1):
        trees[i] = 0
remaining_trees = sum(trees)
print(remaining_trees)

