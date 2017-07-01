#!/usr/bin/groovy

def call(String... goals) {
    String goalsAsString = goals.join(' ')
    sh "./mvnw $goalsAsString"
}