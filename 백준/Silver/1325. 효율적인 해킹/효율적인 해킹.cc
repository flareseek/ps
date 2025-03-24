#include <iostream>
#include <vector>
#define MAX_N 100001

using namespace std;

int N, M;
vector<int> graph[MAX_N];
bool visitied[MAX_N] = {};

int dfs(int n) {
  int cnt = 1;
  visitied[n] = true;
  for (int next: graph[n]) {
    if (visitied[next]) continue;
    cnt += dfs(next);
  }
  return cnt;
}

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
  
  cin >> N >> M;
  for (int i = 0; i < M; i++) {
    int a, b;
    cin >> a >> b;
    graph[b].push_back(a);
  }

  int max = 0;
  int cnt_arr[MAX_N] = {};
  for (int i = 1; i <= N; i++) {
    fill(visitied, visitied+(N+1), false);
    cnt_arr[i] = dfs(i);
    if (max < cnt_arr[i]) max = cnt_arr[i];
  }

  for (int i = 1; i <= N; i++) {
    if (max == cnt_arr[i]) cout << i << " ";
  }

  return 0;
}
