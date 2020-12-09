if [ $1 == "" ]
then
    echo "Usage: $0 <language>"
    exit 1
fi

if [ $1 == "java" ]
then
    cat test/one | java whichalien.java
    cat test/two | java whichalien.java
    cat test/three | java whichalien.java
fi

if [ $1 == "python" ]
then
    cat test/one | python3 whichalien.py
    cat test/two | python3 whichalien.py
    cat test/three | python3 whichalien.py
fi

if [ $1 == "c" ]
then
    cat test/one | ./whichalien
    cat test/two | ./whichalien
    cat test/three | ./whichalien
fi

if [ $1 == "php" ]
then
    cat test/one | php whichalien.php
    cat test/two | php whichalien.php
    cat test/three | php whichalien.php
fi

# [*] "./test.sh java" took 2.6245 seconds to run
# [*] "./test.sh python" took 0.159 seconds to run
# [*] "./test.sh c" took 0.0196 seconds to run
# [*] "./test.sh php" took 0.2367 seconds to run
