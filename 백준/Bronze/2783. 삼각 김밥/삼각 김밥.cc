#include <iostream>

int main(void) {
  int x, y, n;
  float result = 0.0f;

  std::cin >> x >> y >> n;
  result = (float)x/y;

  for (int i = 0; i < n; i++) {
    std::cin >> x >> y;
    float temp = (float)x/y;
    if (temp < result) result = temp;
  }
  std::cout << std::fixed;
  std::cout.precision(2);
  std::cout << (result*1000);
  return 0;
}
