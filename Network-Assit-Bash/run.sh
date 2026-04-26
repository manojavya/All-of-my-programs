#!/bin/bash
version=0.0.1
echo $version
user=$(whoami)
if [ $user = "root" ]; then
    echo "Please do not run as root!"
    exit 1
fi

