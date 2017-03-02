
pwd
echo opensr5 start

ant clean
IF NOT ERRORLEVEL 0 echo ant clean error DETECTED
IF NOT ERRORLEVEL 0 EXIT /B 1

ant
IF NOT ERRORLEVEL 0 echo ant error DETECTED
IF NOT ERRORLEVEL 0 EXIT /B 1



pwd
echo opensr5 finish
