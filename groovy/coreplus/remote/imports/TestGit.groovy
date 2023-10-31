package coreplus.remote.imports

return "Git"

String gitMethod() {
    return "Git method"
}

static String gitStaticMethod() {
    return "Git static method"
}

class GitClass {
    String value = "Git class constructor"
    String getValue() {
        return value
    }
}

String gitMethodUsingClass() {
    return new GitClass().getValue()
}

static String gitStaticMethodUsingClass() {
    return new GitClass().getValue()
}
