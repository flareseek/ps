#include <iostream>
#include <cmath>

int main(void) {
  int N;
  std::cin >> N;
  printf("%.*f", N, pow(0.5, N));
  return 0;
}
