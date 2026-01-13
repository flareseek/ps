#include <iostream>
#include <stack>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int Q, q, c;
  cin >> Q;

  stack<int> s;
  stack<int> h;
  stack<int> undo;
  while(Q--) {
    cin >> q;
    if (q == 1) {
      cin >> c;
      s.push(c);
      h.push(q);
    } else if (q == 2) {
      undo.push(s.top());
      s.pop();
      h.push(q);
    } else if (q == 3) {
      cin >> c;
      while(c--) {
        int r = h.top();
        h.pop();
        if (r == 1) s.pop();
        else {
          s.push(undo.top());
          undo.pop();
        }
      }
    } else if (q == 4) {
      cout << s.size() << "\n";
    } else {
      cout << (s.empty() ? -1 : s.top()) << "\n";
    }
  }

  return 0;
}
