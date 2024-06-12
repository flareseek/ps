#include <iostream>

int main(void) {
  int s1, s2, s3;
  int temp[81] = {0};
  std::cin >> s1 >> s2 >> s3;
  
  for (int i = 1; i <= s1; i++)
    for (int j = 1; j <= s2; j++)
      for (int k = 1; k <= s3; k++)
        temp[i+j+k] ++;

  int max = 0;
  for (int i = 3; i <= s1 + s2 + s3; i++) {
    if (temp[max] < temp[i]) {
      max = i;
    }
  }
  std::cout << max;
  return 0;
}
