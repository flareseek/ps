# [Silver V] 수 정렬하기 2 - 2751 

[문제 링크](https://www.acmicpc.net/problem/2751) 

### 성능 요약

메모리: 8804 KB, 시간: 380 ms

### 분류

정렬

### 문제 설명

<p>N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.</p>

### 출력 

 <p>첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.</p>

## 리뷰
다른사람 풀이를 보니<br>
값의 범위 만큼 배열을 만들어 놓고<br>
index값에 입력값 n을 넣어 n번째 배열에 값 추가하고 마지막으로 배열에 값이 있으면 출력하는 식으로 작성했다.<br>
무식하게 sort를 돌리는것 보다는 메모리를 더 쓰더라도 더 빠르게 짤 수 있다는것을 알 수 있었다.
