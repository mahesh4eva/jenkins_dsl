job("ruby_test_job") {
	parameters {
		stringParam("url", "http://yourapp.com", "Provide your app")
		choiceParam("env", ["QA", "Staging", "Prod"], "Select your environment")
	}

	label("ruby1")
	wrappers {
		preBuildCleanup()
	}

	scm {
		remote {
			url("git@github.com:rajumavuri/jenkins_dsl.git")
			branch("*/master")
		}
	}

	steps {
		shell("echo AUT url is $url \n python -v")
	}
}
