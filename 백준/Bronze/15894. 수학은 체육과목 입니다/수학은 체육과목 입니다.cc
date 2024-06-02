#include <iostream>

int main(void) {
  long n;
  std::cin >> n;

  long result = 1 + n + (n*2) + (n-1); 
  std::cout << result;
  return 0;
}
