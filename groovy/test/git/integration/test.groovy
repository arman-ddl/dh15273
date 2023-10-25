package test.git.integration

println "Git integration"

void gitIntegrationMethod() {
  println "Git integration method"
}

class GitIntegrationClass {
  GitIntegrationClass() {
    println "Git integration class constructor"
  }
}

void gitIntegrationMethodUsingClass() {
  new GitIntegrationClass()
}
