# 🔍 Actions

🔷 Arquivos Actions criado para automatizar o GitHub Actions ao subir um commit em um projeto com Spring Boot.

 <br> 

# 🐘 Gradle

🔷 `build.gradle.kts`, arquivo do Gradle com apenas as configurações necessárias para ter o SonarCloud em seu projeto Spring Boot.

 <br> 

# 🚀 Workflows 

🔷 `workflow.yml`, é executado automaticamente em toda abertura ou atualização de um pull request. Seu objetivo é garantir que o projeto Java esteja compilando corretamente e que todas as dependências estejam resolvidas antes da integração do código.

 <br> 

🔷 `workflow-V2.yml`, Versão aprimorada que utiliza Secrets do GitHub, cria uma pasta e copia o arquivo properties para conectar ao Banco de Dados, além de gerar o relatório de cobertura de testes do JaCoCo.

 <br> 

🔷 `workflow-sonarcloud.yml`, Configuração avançada que integra o SonarCloud ao seu projeto Spring Boot. Ele faz cache dos pacotes do Gradle e do Sonar, realiza o build da aplicação e executa os testes do Sonar para verificar cobertura de código, duplicações, code smells e possíveis bugs.

<br>

## 🖥️ Desenvolvedor

### 🔵 LinkedIn: [Gustavo Correa](https://www.linkedin.com/in/gustavo-chauar-correa-946168269/)
