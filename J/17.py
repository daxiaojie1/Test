N = int(input())
win_map = {'Rock': 'Scissors', 'Scissors': 'Paper', 'Paper': 'Rock'}
for _ in range(N):
    S1, S2 = input().split()
    if S1 == S2:
        print('Tie')
        continue
    if win_map[S1] == S2:
        print('Player1')
    else:
        print('Player2')