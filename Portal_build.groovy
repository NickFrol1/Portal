#!groovy

def call(Closure stages) {
		agent any 
		tools {
		maven 'maven'
		allure 'allure'
		}
		{
			stages()	
	}
} 
