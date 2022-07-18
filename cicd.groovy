node('linux') 
{
        stage('Build') {
                build job: 'Port-Pipeline', parameters: [string(name: 'REPO', value: 'gzipport'), string(name: 'DESCRIPTION', 'gzipport' )]
        }
}
