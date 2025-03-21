#include <iostream>
#include <algorithm>
#include <climits>
#define MAX_USER 101

using namespace std;


int N, M;
int floyd[MAX_USER][MAX_USER] = {};
int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> N >> M;
  
  for (int i = 1; i <= N; i++) {
    for (int j = 1; j <= N; j++) {
      if (i == j) continue;
      floyd[i][j] = INT_MAX;
    }
  }

  for (int i = 0; i < M; i++) {
    int A, B;
    cin >> A >> B;
    floyd[A][B] = 1;
    floyd[B][A] = 1;
  }

  for (int i = 1; i <= N; i++) {
    for (int j = 1; j <= N; j++) {
      for (int k = 1; k <= N; k++) {
        if (floyd[j][i] == INT_MAX || floyd[i][k] == INT_MAX) continue;
        const int dist = floyd[j][i] + floyd[i][k];
        if (dist < floyd[j][k]) {
          floyd[j][k] = dist;
        }
      }
    }
  }

  int min = INT_MAX;
  int index = 0;
  for (int i = 1; i <= N; i++) {
    int temp = 0;
    for (int j = 1; j <= N; j++) {
      if (i == j) continue;
      if (floyd[i][j] == INT_MAX) continue;
      temp += floyd[i][j];
    }
    if (temp < min) {
      index = i;
      min = temp;
    }
  }

  cout << index;
  return 0;
}
