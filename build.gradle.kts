plugins {
	id("jacoco")
	id("org.sonarqube") version "6.0.1.5171"
}

sonar {
	properties {
		property("sonar.projectKey", "NOME_ORGANIZACAO + NOME_PROJETO")
		property("sonar.organization", "PASSWORD")
		property("sonar.host.url", "https://sonarcloud.io") 
	}
}
