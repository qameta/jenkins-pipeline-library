#!/usr/bin/groovy

/**
 * invoke gradle tasks, like "gradle 'clean build'"
 * @param tasks gradle tasks as string
 */
def call(String tasks) {
    sh "./gradlew $tasks"
}