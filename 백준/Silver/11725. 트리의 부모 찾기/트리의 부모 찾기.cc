#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N;
  cin >> N;

  vector< vector<int> > v;
  for (int i = 0; i <= N; i++) v.emplace_back();

  for(int _ = 1; _ < N; _++) {
    int a, b;
    cin >> a >> b;
    v[a].push_back(b);
    v[b].push_back(a);
  }

  bool is[100001] = {false};
  queue<int> q;
  q.push(1);

  while(!q.empty()) {
    int parent = q.front();
    q.pop();
    if (is[parent]) continue;
    is[parent] = true;

    for(auto it = v[parent].begin(); it != v[parent].end(); it++) {
      int child = *it;
      if (is[child]) continue;
      q.push(child);
      v[child].push_back(parent);
    }
  }

  for (int i = 2; i <= N; i++)
    cout << v[i].back() << "\n";
  return 0;
}
