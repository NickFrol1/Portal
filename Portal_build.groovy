#!groovy

def call(Closure stages) {
	timestamps{
		agent any {
			stages()
		}
	}
} 
