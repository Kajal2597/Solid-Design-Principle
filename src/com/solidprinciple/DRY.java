public static void main(String[] args) {

}
// Violating DRY: Repeated code
int addNumbers(int a, int b) { return a + b; }
int addThreeNumbers(int a, int b, int c) { return a + b + c; }

// Refactored to follow DRY
int addNumbers(int... numbers) {
    int sum = 0;
    for (int num : numbers) sum += num;
    return sum;
}
