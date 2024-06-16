#include <iostream>

int main(void) {
  int N, C;
  int files[50] = {0};
  long result = 0;
  std::cin >> N;
  for (int i = 0; i < N; i++)
    std::cin >> files[i];
  std::cin >> C;

  for (int i = 0; i < N; i++) {
    if (files[i] == 0) continue;
    result += ((files[i] - 1) / C + 1)* C;
  }

  std::cout << result;

  return 0;
}
