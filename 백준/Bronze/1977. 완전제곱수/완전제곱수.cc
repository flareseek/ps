#include <iostream>
#include <math.h>

int main(void) {
  int M, N;
  std::cin >> M >> N;

  int min = -1;
  int sum = 0;
  for (int i = M; i <= N; i++) {
    int t = (int)sqrt(i);
    if (t*t == i) {
      if (min == -1) min = i;
      sum += i;
    }
  }

  if (min == -1) std::cout << min;
  else std::cout << sum << std::endl << min;
  return 0;
}
