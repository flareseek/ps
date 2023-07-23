public class Main {
    public static void main(String[] args) {
        int[] A = new int[10001];
        int i = 1;
        while(i < 10000) {
            int sum = i;
            int t = i++;
            while(t > 0) {
                sum += t%10;
                t /= 10;
            }
            if(sum <= 10000) A[sum] ++;
        }
        StringBuilder sb = new StringBuilder();
        for(int j = 1; j < A.length; j++) if(A[j] == 0) sb.append(j).append("\n");
        System.out.print(sb);
    }
}