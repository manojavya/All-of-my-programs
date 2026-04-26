#!/bin/bash
set -e

LOG_FILE="/home/manojavya/Desktop/Code/Perimeter-Area-Calculator/err_logs/error.log"
EXTERNAL_ERROR_LOG="/home/manojavya/Desktop/Code/Perimeter-Area-Calculator/err_logs/external-error.log"

# Trap errors and call handle_error
trap 'handle_error' ERR

# Function to handle external errors
handle_error() {
    echo "An external error occurred. Check $EXTERNAL_ERROR_LOG for details."
    echo "Please report the issue to the developer if the error persists." 
    echo "$(date): An error occurred in the script." >> "$EXTERNAL_ERROR_LOG"
    exit 1
}


if command -v lolcat &> /dev/null
then
    read -p "lolcat is available. Do you want to run the application with lolcat? (y/n): " choice
    if [[ "$choice" == "y" || "$choice" == "Y" ]]; then
        exec java -jar /home/manojavya/Desktop/Code/Perimeter-Area-Calculator/src/Application.jar 2>> "$LOG_FILE" | lolcat
    else
        exec java -jar /home/manojavya/Desktop/Code/Perimeter-Area-Calculator/src/Application.jar 2>> "$LOG_FILE"
    fi
else
    exec java -jar /home/manojavya/Desktop/Code/Perimeter-Area-Calculator/src/Application.jar 2>> "$LOG_FILE"
fi