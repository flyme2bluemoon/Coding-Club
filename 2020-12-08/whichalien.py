"""
- TroyMartian, who has at least 3 antenna and at most 4 eyes;
- VladSaturnian, who has at most 6 antenna and at least 2 eyes;
- GraemeMercurian, who has at most 2 antenna and at most 3 eyes.
"""

antennas = int(input("How many antennas?\n"))
eyes = int(input("How many eyes?\n"))

aliens = {
    "TroyMartian": True,
    "VladSaturnian": True,
    "GraemeMercurian": True
}

if (antennas < 3 or eyes > 4):
    aliens["TroyMartian"] = False
if (antennas > 6 or eyes < 2):
    aliens["VladSaturnian"] = False
if (antennas > 2 or eyes > 3):
    aliens["GraemeMercurian"] = False

for i in aliens:
    if aliens[i] == True:
        print(i)