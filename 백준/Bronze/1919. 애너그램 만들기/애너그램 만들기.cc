#include <iostream>
#include <string>

int main(void) {
  std::string str1, str2;
  int w1[26] = {0};
  int w2[26] = {0};
  std::cin >> str1 >> str2;

  int size1 = str1.size();
  int size2 = str2.size();

  for (int i = 0; i < size1; i++)
    w1[str1[i] - 'a']++;

  for (int i = 0; i < size2; i++)
    w2[str2[i] - 'a']++;

  int result = 0;
  for (int i = 0; i < 26; i++) {
    int t = w1[i] - w2[i];
    if (t < 0) t = -t;
    result += t;
  }

  std::cout << result;
  
  return 0;
}
