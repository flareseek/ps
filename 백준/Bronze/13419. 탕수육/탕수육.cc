#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int T;
  cin >> T;
  while(T--) {
    string str, f, s;
    cin >> str;
    const int len = str.length();
    for (int i = 0; i < len; i++) {
      if (i%2 == 0) f += str[i];
      else s += str[i];
    }
    if (len%2 != 0) {
      str = f;
      f.append(s);
      s.append(str);
    }
    cout << f << "\n" << s << "\n";
  }
  return 0;
}
