#!/usr/bin/groovy

def call(String goals) {
    sh "./mvnw $goals"
}