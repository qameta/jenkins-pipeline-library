#!/usr/bin/groovy

/**
 * invoke gradle tasks, like "gradleBuild 'clean build'"
 * @param tasks gradle tasks as string
 */
def call(body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    sh "./gradlew ${config.tasks}"
}