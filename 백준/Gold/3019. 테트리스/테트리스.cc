#include <iostream>

using namespace std;

int C, P, result;
int field[100];

const int arr00[] = {0, 0}, arr01[] = {0, 1}, arr10[] = {1, 0}, arr20[] = {2, 0}, arr02[] = {0, 2}, arr000[] = {0, 0, 0}, arr001[] = {0, 0, 1}, arr100[] = {1, 0, 0}, arr011[] = {0, 1, 1}, arr101[] = {1, 0, 1}, arr110[] = {1, 1, 0}, arr0000[] = {0, 0, 0, 0};

void cnt(const int* arr, int size) {
  for (int i = 0; i < C-size+1; i++) {
    const int H = field[i]-arr[0];
    int j = 0;
    while((++j) < size) if (field[i+j]-arr[j] != H) break;
    if (j == size) result ++;
  }
}

void I() {
  cnt(arr0000, 4);
  result += C;
}

void O() {
  cnt(arr00, 2);
}

void S() {
  cnt(arr001, 3);
  cnt(arr10, 2);
}

void Z() {
  cnt(arr100, 3);
  cnt(arr01, 2);
}

void T() {
  cnt(arr000, 3);
  cnt(arr01, 2);
  cnt(arr101, 3);
  cnt(arr10, 2);
}

void L() {
  cnt(arr000, 3);
  cnt(arr00, 2);
  cnt(arr011, 3);
  cnt(arr20, 2);
}

void J() {
  cnt(arr000, 3);
  cnt(arr02, 2);
  cnt(arr110, 3);
  cnt(arr00, 2);
}

void(*fns[])() = {NULL, I, O, S, Z, T, L, J};

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cin >> C >> P;

  for(int i = 0; i < C; i++) cin >> field[i];
  fns[P]();
  cout << result;
  return 0;
}
