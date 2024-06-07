#include <iostream>

int main(void) {
  int N, M;
  int boxSize[50] = {0};
  int boxCap[50] = {0};

  std::cin >> N >> M;
  for(int i = 0; i < N; i++)
    std::cin >> boxSize[i];

  int cur = 0;
  while (M-->0) {
    int b;
    std::cin >> b;
    while (boxCap[cur]+b > boxSize[cur]) cur ++;
    boxCap[cur] += b;
  }

  int result = 0;
  for(int i = 0; i < N; i++)
    result += (boxSize[i] - boxCap[i]);
  
  std::cout << result;
  return 0;
}
