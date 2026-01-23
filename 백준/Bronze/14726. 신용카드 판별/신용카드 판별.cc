#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
  int T;
  cin >> T;
  while(T--) {
    int result = 0;
    for(int i = 1; i <= 16; i++) {
      char c;
      cin >> c;
      c -= '0';
      if (i%2) {
        c <<= 1;
        result += ((c/10) + (c%10));
      }
      else result += c;
    }
    cout << ((result%10) ? 'F' : 'T') << "\n";
  }
  return 0;
}
