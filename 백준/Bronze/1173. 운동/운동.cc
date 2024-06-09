#include <iostream>

int main(void) {
  int N, m, M, T, R, C, time = 0;
  std::cin >> N >> m >> M >> T >> R;

  if (m+T > M) {
    std::cout << -1;
    return 0;
  }
  C = m;
  while (N>0) {
    if (C+T <= M) {
      C += T;
      N--;
    } else {
      C -= R; 
      if (C < m) C = m;
    }
    time ++;
  }
  std::cout << time;
  return 0;
}
