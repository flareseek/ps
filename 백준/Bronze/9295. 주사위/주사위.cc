#include <iostream>

int main(void) {
  int N;
  std::cin >> N;
  for (int i = 1; i <= N; i++) {
    int a, b;
    std::cin >> a >> b;
    std::cout << "Case " << i << ": " << a+b << std::endl;
  }
  return 0;
}
