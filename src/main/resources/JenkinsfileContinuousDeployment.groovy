@Library('XXXXXX')
String sourceCloneUrl = 'url-to-git-repo'
String mailtoFailure = 'my-email'
String mailtoSuccess = 'my-email'


idp_deploy {
    message = 'this is deploy-stage on sandbox'
    stage = 'stg'
    targetServers = ['xxx.stg00.example.org']
    artifactId = 'my-tool'
    applicationName = 'my-tool'
    deployVersion = version
    smoketestProtocol = 'http'
    smoketestPort = 8080
    smoketestRelativeUrl = '/my-tool/status/info'
    smoketestConnectionTimeoutSec = 300
    smoketestRetries = 60
    smoketestRetryIntervalMsec = 1000
    remotecontrolVersion = "0.1.0"
}

idp_deploy {
    message = 'this is deploy-stage on pro'
    stage = 'pro'
    targetServers = ['example1.pro00.example.org', 'example2.pro00.example.org']
    artifactId = 'my-tool'
    applicationName = 'my-tool'
    deployVersion = version
    smoketestProtocol = 'http'
    smoketestPort = 8080
    smoketestRelativeUrl = '/my-tool/status/info'
    smoketestConnectionTimeoutSec = 300
    smoketestRetries = 60
    smoketestRetryIntervalMsec = 1000
    remotecontrolVersion = "0.1.0"
}

idp_finalNotification {
    message = 'sending notification'
    mailReceiver = mailtoSuccess
}
