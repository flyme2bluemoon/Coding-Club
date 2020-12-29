#include <stdio.h>

int main (void) {
    int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    int length_of_array = sizeof(array) / sizeof(array[0]);
    int largest_sum = 0;

    for (int i = 0; i < length_of_array; i++) {
        int tmp_sum = 0;
        for (int j = i; j < length_of_array; j++) {
            tmp_sum += array[j];
            if (tmp_sum > largest_sum) {
                largest_sum = tmp_sum;
            }
        }
    }

    printf("%d\n", largest_sum);

    return 0;
}