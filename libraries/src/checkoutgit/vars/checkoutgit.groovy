// vars/checkoutRepo.groovy
def call(String repoUrl, (String branch) {
    checkout([
        $class: 'GitSCM', 
        branches: [[name: branch]],
        userRemoteConfigs: [[url: repoUrl]]
    ])
    echo "Checked out repository ${repoUrl} on branch ${branch}"
}

