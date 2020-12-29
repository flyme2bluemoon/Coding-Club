#include <stdio.h>

int main (void) {
    char array[] = {'a', 'b', 'c', 't'};
    int length_of_array = (sizeof(array) / sizeof(array[0]));
    
    printf("{");
    for (int i = length_of_array - 1; i >= 0 ; i--) {
        printf("%c, ", array[i]);
    }
    printf("\b\b}\n");

    return 0;
}