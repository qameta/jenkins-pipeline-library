#!/usr/bin/groovy

/**
 * invoke gradle tasks, like "gradle 'clean build'"
 * @param tasks gradle tasks as string
 */
def call(String tasks) {
    sh "./gradlew $tasks"
}

def call(body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    sh "./gradlew ${config.tasks}"
}