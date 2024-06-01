#include <iostream>
#include <string>

int main(void) {
  std::string str;
  std::cin >> str;
  int strSize = str.size();

  for (int i = 0; i < strSize/2; i++) {
    if (str[i] != str[strSize-i-1]) {
      std::cout << 0;
      return 0;
    }
  }
  std::cout << 1;
  return 0;
}
