node('linux') 
{
        stage('Build') {
                build job: 'Port-Pipeline', parameters: [string(name: 'REPO', value: 'gzipport'), string(name: 'DESCRIPTION', 'gzip is a file format and a software application used for file compression and decompression.' )]
        }
}
