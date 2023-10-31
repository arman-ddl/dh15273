package coreplus.remote.imports

return "Git"

String remoteMethod() {
    return "Git method"
}

static String remoteStaticMethod() {
    return "Git static method"
}

class RemoteClass {
    String value = "Git class constructor"
    String getValue() {
        return value
    }
}

String remoteMethodUsingClass() {
    return new RemoteClass().getValue()
}

static String remoteStaticMethodUsingClass() {
    return new RemoteClass().getValue()
}
