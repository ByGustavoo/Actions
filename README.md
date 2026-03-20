# 🔍 Actions

🔷 Arquivos Actions criado para automatizar o GitHub Actions ao subir um commit em um projeto com Spring Boot.

 <br> 

# 🐘 Gradle

🔷 `build.gradle.kts`, arquivo do Gradle com apenas as configurações necessárias para ter o SonarCloud em seu projeto Spring Boot.

 <br> 

# 🚀 Workflows 

🔷 `workflow.yml`, é executado automaticamente em toda abertura ou atualização de um pull request. Seu objetivo é garantir que o projeto Java esteja compilando corretamente e que todas as dependências estejam resolvidas antes da integração do código.

 <br> 

🔷 `workflow-V2.yml`, é executado a cada pull request para validar uma aplicação Spring Boot com Gradle. Ele configura um ambiente com Java 21 e um serviço de PostgreSQL, utilizando secrets do GitHub para definir credenciais e variáveis sensíveis de forma segura. Durante o processo, o código é baixado, o ambiente é preparado com arquivos de configuração necessários, e o projeto é compilado utilizando o Gradle Wrapper. Em seguida, são executados testes automatizados com geração de relatório de cobertura via JaCoCo, garantindo a qualidade do código antes da integração.

 <br> 

🔷 `workflow-sonarcloud.yml`, Configuração avançada que integra o SonarCloud ao seu projeto Spring Boot. Ele faz cache dos pacotes do Gradle e do Sonar, realiza o build da aplicação e executa os testes do Sonar para verificar cobertura de código, duplicações, code smells e possíveis bugs.

<br>

## 🖥️ Desenvolvedor

### 🔵 LinkedIn: [Gustavo Correa](https://www.linkedin.com/in/gustavo-chauar-correa-946168269/)
