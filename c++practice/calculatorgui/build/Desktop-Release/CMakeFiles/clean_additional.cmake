# Additional clean files
cmake_minimum_required(VERSION 3.16)

if("${CONFIG}" STREQUAL "" OR "${CONFIG}" STREQUAL "Release")
  file(REMOVE_RECURSE
  "CMakeFiles/calculatorgui_autogen.dir/AutogenUsed.txt"
  "CMakeFiles/calculatorgui_autogen.dir/ParseCache.txt"
  "calculatorgui_autogen"
  )
endif()
