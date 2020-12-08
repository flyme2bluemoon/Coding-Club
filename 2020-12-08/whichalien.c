#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

#define BUFFERSIZE 5

typedef struct Alien {
    char name[50];
    bool status;
} Alien;

/*
- TroyMartian, who has at least 3 antenna and at most 4 eyes;
- VladSaturnian, who has at most 6 antenna and at least 2 eyes;
- GraemeMercurian, who has at most 2 antenna and at most 3 eyes.
*/

int main(void) {
    char antennas_input[BUFFERSIZE];
    char eyes_input[BUFFERSIZE];

    printf("How many antennas?\n");
    fgets(antennas_input, BUFFERSIZE, stdin);
    printf("How many eyes?\n");
    fgets(eyes_input, BUFFERSIZE, stdin);

    int antennas = atoi(antennas_input);
    int eyes = atoi(eyes_input);

    Alien aliens[3];

    strcpy(aliens[0].name, "TroyMartian");
    aliens[0].status = true;
    strcpy(aliens[1].name, "VladSaturnian");
    aliens[1].status = true;
    strcpy(aliens[2].name, "GraemeMercurian");
    aliens[2].status = true;

    if (antennas < 3 || eyes > 4) {
        aliens[0].status = false;
    }
    if (antennas > 6 || eyes < 2) {
        aliens[1].status = false;
    }
    if (antennas > 2 || eyes > 3) {
        aliens[2].status = false;
    }

    for (int i = 0; i < 3; i++) {
        if (aliens[i].status) {
            printf("%s\n", aliens[i].name);
        }
    }

    return 0;
}