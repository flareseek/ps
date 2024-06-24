#include <iostream>

int main(void) {
  int N, S;
  while(std::cin >> N >> S)
    std::cout << S/(N+1) << std::endl;
  return 0;
}
