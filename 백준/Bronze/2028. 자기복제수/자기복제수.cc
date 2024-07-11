#include <iostream>

int main(void) {
  int T;
  std::cin >> T;
  while (T--) {
    int N, NN, t = 10;
    std::cin >> N;
    NN = N*N;
    while(t <= N) t *= 10;

    std::cout << (NN%t == N ? "YES\n" : "NO\n");
  }
  return 0;
}
