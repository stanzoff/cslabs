#include <stdio.h>

int add(int a, int b) {
	return a + b;
}

int sub(int a, int b) {
	return a - b;
}

int mul(int a, int b) {
	return a * b;
}

float div(float a, float b) {
	return a / b;
}

int square(int x) {
	int mult(int a, int b) {
		return a * b;
	}
	return mult(x, x);
}

int sum_squares(x, y) {
	return add(square(x), square(y));
}

int main() {
	int a = 3;
	int b = 5;
	printf("\n");
	printf("a = %d, b = %d\n", a, b);
	printf("sum_squares(a, b): %d\n", sum_squares(a, b));
	printf("\n");

/*	printf("add(a, b): %d\n", add(a, b));
	printf("sub(a, b): %d\n", sub(a, b));
	printf("mul(a, b): %d\n", mul(a, b));
	printf("div(a, b): %f\n", div(a, b));
	printf("square(a): %d\n", square(a));
*/
    return 0;
}
