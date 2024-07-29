#include <iostream>

int main(void) {
  int W = 0;
  for(int i = 0; i < 6; i++) {
    char c;
    std::cin >> c;
    if (c == 'W') W++;
  }
  if (5 <= W) std::cout << "1";
  else if (3 <= W) std::cout << "2";
  else if (1 <= W) std::cout << "3";
  else std::cout << "-1";
  return 0;
}
