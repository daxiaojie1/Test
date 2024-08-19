def is_jolly_jumper(sequence):
    n = len(sequence)
    if n == 1:
        return "Jolly"
    differences = set(abs(sequence[i] - sequence[i-1]) for i in range(1, n))
    if differences == set(range(1, n)):
        return "Jolly"
    else:
        return "Not jolly"

n, *sequence = map(int, input().split())
print(is_jolly_jumper(sequence))

