#include <iostream>
#include <queue>
#include <utility>
#include <functional>
#include <vector>

using namespace std;

int N, M, t, result;
queue<int> waiting;
pair<int, int> car[2001];
int park[2001];
priority_queue<int, vector<int>, greater<int> > q;

void parking(int t) {
  int p = q.top();
  q.pop();
  result += park[p] * car[t].first;
  car[t].second = p;
}

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> N >> M;

  for(int i = 1; i <= N; i++) {
    cin >> park[i];
    q.push(i);
  }

  for (int i = 1; i <= M; i++) {
    cin >> car[i].first;
    car[i].second = 0;
  }

  for(int i = 0; i < M*2; i++) {
    cin >> t;
    if (t > 0) {
      if (q.empty()) waiting.push(t);
      else parking(t);
    } else {
      t *= -1;
      q.push(car[t].second);
      if(!waiting.empty()) {
        auto c = waiting.front();
        waiting.pop();
        parking(c);
      }
    }
  }
  cout << result;
  return 0;
}
