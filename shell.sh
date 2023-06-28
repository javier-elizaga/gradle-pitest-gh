#!/bin/bash
GRADLE_OUTPUT=$(./gradlew pitest 2>&1) || true
echo $?
echo $GRADLE_OUTPUT