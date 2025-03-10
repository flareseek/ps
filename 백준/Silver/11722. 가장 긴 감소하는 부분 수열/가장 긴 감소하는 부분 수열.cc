#include <iostream>
#include <algorithm>
#define MAX_LEN 1000
using namespace std;

int main(void) {
  int n;
  cin >> n;
  int arr[MAX_LEN] = {};
  for (int i = 0; i < n; i++)
    cin >> arr[i];

  int dp[MAX_LEN] = {};
  for (int i = n-1; i >= 0; i--) {
    int len = 0;
    for (int j = i+1; j < n; j++) {
      if (arr[i] > arr[j]) len = max(len, dp[j]);
    }
    if (len == 0) dp[i] = 1;
    else dp[i] = len + 1;
  }
  // O(N^2)

  cout << *max_element(dp, dp+n);
  return 0;
}