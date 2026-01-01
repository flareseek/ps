#include <iostream>
#include <algorithm>

using namespace std;

const int COUNT[26] = { 3,2,1,2,4,3,1,3,1,1,3,1,3,2,1,2,2,2,1,2,1,1,1,2,2,1 };

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int a_len, b_len;
  string A, B;
  int arr[202] = {0};
  cin >> a_len >> b_len >> A >> B;

  int LEN = a_len + b_len;
  for (int a_idx = 0, b_idx = 0, i = 0; i < LEN; i++) {
    if ((i % 2 == 0 && a_idx < a_len) || (b_idx >= b_len) ) {
      arr[i] = COUNT[A[a_idx++]-'A'];
    } else if ((i % 2 == 1 && b_idx < b_len) ||(a_idx >= a_len))  {
      arr[i] = COUNT[B[b_idx++]-'A'];
    }
  }

  for (; LEN != 2; LEN--)
    for (int i = 0; i < LEN-1; i++)
      arr[i] = (arr[i] + arr[i+1]) % 10;

  cout << (arr[0]*10 + arr[1]) << "%";
  return 0;
}
