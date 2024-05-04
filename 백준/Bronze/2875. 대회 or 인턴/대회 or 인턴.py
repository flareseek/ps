N, M, K = map(int, input().split())

K -= N % 2
N //= 2

if N > M:
    K -= (N-M) * 2
    N = M
elif M > N:
    K -= (M-N)
    M = N

while K > 0:
    M -= 1
    K -= 3

print(M if M > 0 else 0)