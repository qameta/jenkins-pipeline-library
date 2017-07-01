#!/usr/bin/groovy

def call(String tasks) {
    sh "./gradlew $tasks"
}