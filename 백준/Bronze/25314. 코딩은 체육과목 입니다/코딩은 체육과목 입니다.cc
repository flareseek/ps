#include <iostream>

int main(void) {
  int a;
  std::cin >> a;

  for (int i = 0; i < ((a-1)/4 + 1); i++)
    std::cout << "long ";

  std::cout << "int";
  return 0;
}
