job("ruby_test_job") {
	parameters {
		stringParam("url", "http://yourapp.com", "Provide your app")
		choiceParam("env", ["QA", "Staging", "Prod"], "Select your environment")
	}

	label("ruby1")

	scm {
		github("git@github.com:rajumavuri/jenkins_dsl.git", "master")
	}

	steps {
		shell("echo 'AUT url is \$url' \npython -v")
	}
}

