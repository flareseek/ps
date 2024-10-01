#include <iostream>

int main(void) {
    int N, A, B, C, D;
    std::cin >> N >> A >> B >> C >> D;
    
    int a = ((N-1)/A+1)*B;
    int b = ((N-1)/C+1)*D;
    std::cout << (a > b ? b : a);
    return 0;
}