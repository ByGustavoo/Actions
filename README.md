# 🔍 Actions

🔷 Arquivos Actions criado para automatizar o GitHub Actions ao subir um commit em um projeto com Spring Boot.


 <br> 


# 🐘 Gradle

 
🔷 `build.gradle.kts`, arquivo do Gradle com apenas as configurações necessárias para ter o SonarCloud em seu projeto Spring Boot.


 <br> 
 

# 🚀 Workflows 


🔷 `workflow.yml`,  Arquivo com configurações básicas para integração com o GitHub Actions em seu projeto Spring Boot com Gradle, garantindo a execução do build da aplicação.

 <br> 

🔷 `workflow-V2.yml`, Versão aprimorada que utiliza Secrets do GitHub, cria uma pasta e copia o arquivo properties para conectar ao Banco de Dados, além de gerar o relatório de cobertura de testes do JaCoCo.

 <br> 

🔷 `workflow-sonarcloud.yml`, Configuração avançada que integra o SonarCloud ao seu projeto Spring Boot. Ele faz cache dos pacotes do Gradle e do Sonar, realiza o build da aplicação e executa os testes do Sonar para verificar cobertura de código, duplicações, code smells e possíveis bugs.
