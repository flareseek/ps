#include <algorithm>
#include <iostream>
#include <string>

int main(void) {
  std::string str;
  std::cin >> str;
  std::transform(str.begin(), str.end(), str.begin(), ::toupper);
  std::cout << str;
  return 0;
}
