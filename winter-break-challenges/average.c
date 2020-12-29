#include <stdio.h>

int main (void) {
    int array[] = {1, 3, 6, 15, 78, 94};
    double sum = 0;

    for (int i = 0; i < (sizeof(array) / sizeof(array[0])); i++) {
        sum += array[i];
    }

    double average = sum / (sizeof(array) / sizeof(array[0]));

    printf("%f\n", average);

    return 0;
}