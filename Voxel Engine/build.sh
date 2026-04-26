#!/bin/bash

# Set the path to the LWJGL native libraries
LWJGL_NATIVE_PATH="/home/manojavya/Desktop/Code/Voxel Engine/libs/native/linux"

# Compile the Java code
javac -d bin -cp "libs/lwjgl.jar:libs/lwjgl-glfw.jar:libs/lwjgl-opengl.jar" src/App.java

# Run the program with the native library path
java -cp "bin:libs/lwjgl.jar:libs/lwjgl-glfw.jar:libs/lwjgl-opengl.jar" \
     -Dorg.lwjgl.librarypath="$LWJGL_NATIVE_PATH" \
     App