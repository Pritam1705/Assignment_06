def call() {
    stage('playbook execution') {

        sh "ansible-playbook grafana/tests/test.yml -i grafana/tests/inventory "
    }
}

