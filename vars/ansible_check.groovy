def call() {
    stage('Clone Repository') {
        git branch: 'main', url: 'https://github.com/Pritam1705/Grafana_role.git'
    }
}
