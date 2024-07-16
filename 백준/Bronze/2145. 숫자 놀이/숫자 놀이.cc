#include <iostream>

int main(void) {
  int n;
  std::cin >> n;
  while(n != 0) {
    do {
      int temp = 0;
      while(n != 0) {
        temp += n%10;
        n /= 10;
      }
      n = temp;
    } while(n/10 != 0);
    std::cout << n << std::endl;
    std::cin >> n;
  }
  return 0;
}
