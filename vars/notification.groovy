def call() {
    stage('notify') {
          emailext body: 'success', subject: 'Status', to: 'kondapratiwarpritam855@gmail.com'
          slackSend channel: 'jenkinnotify', message: 'successfull '
    }
}
