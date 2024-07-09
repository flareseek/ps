#include <iostream>

int main(void) {
  int N;
  std::cin >> N;

  if (N == 1)
    std::cout << 5;
  else
    std::cout << ((long)(((2+N+1)/(double)2)*N*3 - 2*N) + 1) % 45678;
  return 0;
}
