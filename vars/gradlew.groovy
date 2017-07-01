#!/usr/bin/groovy

def call(String... tasks) {
    String tasksAsString = tasks.join(' ')
    sh "./gradlew $tasksAsString"
}