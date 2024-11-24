#include <iostream>

int N;
int cnt = 0;
bool visitCol[15] = {false};
bool diagonalTop[29] = {false};
bool diagonalBottom[29] = {false};

void bt(int curRow) {
    if (curRow == N) {
        cnt ++;
        return;
    }

    for (int i = 0; i < N; i++) {
        if (visitCol[i] || diagonalBottom[curRow-i+(N-1)] || diagonalTop[i+curRow]) 
            continue;
        visitCol[i] = true;
        diagonalTop[i+curRow] = true;
        diagonalBottom[curRow-i+(N-1)] = true;
        bt(curRow+1);
        visitCol[i] = false;
        diagonalTop[i+curRow] = false;
        diagonalBottom[curRow-i+(N-1)] = false;
    }
}

int main(void) {
    std::cin >> N;
    bt(0);
    std::cout << cnt;
}
