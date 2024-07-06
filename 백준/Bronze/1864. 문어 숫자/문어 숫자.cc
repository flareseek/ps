#include <iostream>
#include <string>

int main(void) {
  std::string str;
  std::cin >> str;
  while(str != "#") {
    long result = 0;
    int cur = 1;
    int size = str.length();
    for (int i = size-1; i >= 0; i--) {
      int t = 0;
      switch (str[i]) {
        case '-':
          t = 0;
          break;
        case '\\':
          t = 1;
          break;
        case '(':
          t = 2;
          break;
        case '@':
          t = 3;
          break;
        case '?':
          t = 4;
          break;
        case '>':
          t = 5;
          break;
        case '&':
          t = 6;
          break;
        case '%':
          t = 7;
          break;
        case '/':
          t = -1;
          break;
      }
      result += t*cur;
      cur *= 8;
    }
    std::cout << result << std::endl;
    std::cin >> str;
  }
  return 0;
}
