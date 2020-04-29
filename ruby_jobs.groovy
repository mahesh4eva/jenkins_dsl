job("ruby_test_job") {
	parameters {
		stringParam("url", "http://yourapp.com", "Provide your app")
		choiceParam("env", ["QA", "Staging", "Prod"], "Select your environment")
	}

	label("ruby1")

	scm {
		github("rajumavuri/jenkins_dsl", "master")
	}

	steps {
		shell("echo 'AUT url is \$url' \nruby -V")
	}
}

job("ruby_test_job2") {
	parameters {
		stringParam("url", "http://yourapp.com", "Provide your app")
		choiceParam("env", ["QA", "Staging", "Prod"], "Select your environment")
	}

	label("ruby2")

	scm {
		github("rajumavuri/jenkins_dsl", "master")
	}

	steps {
		shell("echo 'AUT url is \$url' \nruby -V")
	}
}