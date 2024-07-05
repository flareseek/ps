#include <iostream>

int main(void) {
  int N, C;
  bool arr[2000001] = {false};
  std::cin >> N >> C;
  for (int i = 0; i < N; i++) {
    int t;
    std::cin >> t;

    for (int i = 1; t*i <= C; i++)
      arr[t*i] = true;
  }

  int result = 0;
  for(int i = 0; i <= C; i++)
    if (arr[i]) 
      result ++;

  std::cout << result;
  return 0;
}
