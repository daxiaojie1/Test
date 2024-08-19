N, NA, NB = map(int, input().split())

A_pattern = list(map(int, input().split()))
B_pattern = list(map(int, input().split()))


A_wins = 0
B_wins = 0


win_map = {(0, 2): 'A', (2, 5): 'A', (5, 0): 'A',
           (2, 0): 'B', (5, 2): 'B', (0, 5): 'B'}

for i in range(N):
    a_throw = A_pattern[i % NA]
    b_throw = B_pattern[i % NB]

    # 根据胜负关系更新计数器
    if (a_throw, b_throw) in win_map:
        winner = win_map[(a_throw, b_throw)]
        if winner == 'A':
            A_wins += 1
        else:
            B_wins += 1

if A_wins > B_wins:
    print("A")
elif B_wins > A_wins:
    print("B")
else:
    print("draw")