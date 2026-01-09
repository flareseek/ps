#include <iostream>
#include <algorithm>

using namespace std;

string strs[100];

bool is(const string& str) {
  const int len = str.length();
  for(int idx = 0; idx <= len/2; idx++)
    if (str[idx] != str[len-1-idx])
      return false;
  cout << str << "\n";
  return true;
}

bool s(int k) {
  for (int i = 0; i < k; i++) {
    for (int j = i+1; j < k; j++) {
      const string f = strs[i] + strs[j];
      if (is(strs[i]+strs[j])) return true;
      else if (is(strs[j]+strs[i])) return true;
    }
  }
  return false;
}

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int T;
  cin >> T;
  while(T--) {
    int k;
    cin >> k;
    for (int i = 0; i < k; i++) cin >> strs[i];
    if (!s(k)) cout << 0 << "\n";
  }
  return 0;
}
