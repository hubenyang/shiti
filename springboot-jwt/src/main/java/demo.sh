#!/usr/bin/env bash

#echo "hello world"
#user_name="hubenyang"
#echo $user_name
#str="wo shi "$user_name""
#echo -e  $str
#echo "执行的第一个：$0"
#echo "执行的第二个：$1"
#echo "number：$#"
#echo "list $*"
SYSTEM=`uname -s`
#echo $SYSTEM
if [ "$SYSTEM" = "linux" ]; then
echo "linux"
else
echo "what?"
fi
mysql -uroot -pHBYhby123
use test;
tables =`show tables;`
for i in $tables
do
echo i
done
