#!/usr/bin/groovy

/**
 * invoke maven goals, like "mavenBuild 'clean verify'"
 * @param tasks maven goals as string
 */
def call(String goals) {
    sh "./mvnw $goals"
}