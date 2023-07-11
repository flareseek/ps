#include <stdio.h>

int main(void)
{
	int N;
	scanf("%d", &N);
	int I[2000001] = {0, };
	int t = N;
	while(t-->0) {
		int n;
		scanf("%d", &n);
		I[n+1000000] = 1;
	}
	for(int i = 0; N > 0; i++) {
		if(I[i]) {
			printf("%d\n", i-1000000);
			N--;
		}
	}
	return 0;
}