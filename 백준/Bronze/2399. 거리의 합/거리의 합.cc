#include <iostream>

int main(void) {
  int n;
  int arr[10000];
  long long result = 0;
  std::cin >> n;
  for(int i = 0; i < n; i++) 
    std::cin >> arr[i];

  for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
      int t = arr[i] - arr[j];
      if (t < 0) t = -t;
      result += (long long)t;
    }
  }
  std::cout << result;
  return 0;
}
