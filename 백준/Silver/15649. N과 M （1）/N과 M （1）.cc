#include <iostream>

int n, m;
int arr[8];
bool isVisit[9];
void bt(int cnt) {
    if (cnt == m) {
        for (int i = 0; i < m; i++)
            std::cout << arr[i] << " ";
        std::cout << "\n";
    }
    for (int i = 1; i <= n; i ++) {
        if (isVisit[i]) continue;
        arr[cnt] = i;
        isVisit[i] = true;
        bt(cnt+1);
        isVisit[i] = false;
    }
}

int main(void) {
    std::cin >> n >> m;
    bt(0);
    return 0;
}
