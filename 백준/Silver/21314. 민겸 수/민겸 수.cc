#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  string str;
  cin >> str;

  const int LEN = str.length();
  string M, m;

  int cnt = 0;
  for(int i = 0; i < LEN; i++) {
    if (str[i] == 'M') {
      cnt ++;
      if (cnt == 1) m += '1';
      else m += '0';
    }
    else {
      M += '5';
      m += '5';
      while(cnt--) M += '0';
      cnt = 0;
    }
  }
  if (cnt) {
    M += '1';
    while(--cnt) M += '1';
  }
  cout << M << "\n" << m;

  return 0;
}
