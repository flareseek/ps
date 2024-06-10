#include <iostream>
#include <string>

int main(void) {
  std::string input, result;
  std::cin >> input;

  bool isZero = false;
  int size = input.size();
  if (size == 1 && input[0] - '0' == 0) {
    std::cout << 0;
    return 0;
  }
  for(int i = 0; i < size; i++) {
    char n = input[i]-'0';
    for (int j = 2; j >= 0; j--) {
      int v = (n >> j) & 1;
      if (isZero) std::cout << v;
      else if (v == 1) {
        std::cout << v;
        isZero = true;
      }
    }
  }

  return 0;
}
