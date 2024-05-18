#include <iostream>

int main(void) {
  int n;
  std::cin >> n;
  
  int out = 0;
  while(n-->0) {
    int result = 0;
    int a, b, c;
    std::cin >> a >> b >> c;
    if (a == b && b == c) {
      result += 10000 + a * 1000;
    } else if ((a == b && b != c) || (a != b && b == c)) {
      result += 1000 + b * 100;
    } else if (a == c && a != b) {
      result += 1000 + a * 100;
    } else if (a != b && b != c) {
      int max = a;
      if (b > max) max = b;
      if (c > max) max = c;
      result += max * 100;
    } 
    if (result > out) out = result;
  }
  std::cout << out;
  return 0;
}
