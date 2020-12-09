<?php

echo "How many antennas?\n";
$antennas = trim(fgets(STDIN));
echo "How many eyes?\n";
$eyes = trim(fgets(STDIN));

$aliens = [
    "TroyMartian" => true,
    "VladSaturnian" => true,
    "GraemeMercurian" => true
];

if ($antennas < 3 || $eyes > 4) {
    $aliens["TroyMartian"] = false;
}
if ($antennas > 6 || $eyes < 2) {
    $aliens["VladSaturnian"] = false;
}
if ($antennas > 2 || $eyes > 3) {
    $aliens["GraemeMercurian"] = false;
}

foreach ($aliens as $name => $value) {
    if ($value) {
        echo $name . "\n";
    }
}

?>