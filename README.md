<div align="center"> <br> 
  <img align="center" height="150" width="150" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/githubactions/githubactions-original.svg" />
</div> 

 <br> 
 
<div align="center">
  Arquivos de GitHub Actions desenvolvidos para automatizar o processo de integração e entrega contínua em um projeto Spring Boot, sendo acionados automaticamente a cada novo commit, garantindo build, testes,       análise de qualidade e publicação da aplicação de forma padronizada e segura.
</div> 

 <br> 

# 🐘 Gradle

🔷 `build.gradle.kts`, arquivo do Gradle com apenas as configurações necessárias para ter o SonarCloud em seu projeto Spring Boot.

 <br> 

# 🚀 Workflows 

🔷 `workflow.yml`, é executado a cada pull request para a branch principal, garantindo que a aplicação Spring Boot esteja compilando corretamente antes da integração. Ele realiza o checkout do código, configura o ambiente com Java 25 e prepara o Gradle Wrapper para execução. Em seguida, executa o build do projeto, ignorando os testes, com o objetivo de validar rapidamente a compilação e identificar possíveis erros no código.
 <br> 

🔷 `workflow-V2.yml`, é executado a cada pull request para validar uma aplicação Spring Boot com Gradle. Ele configura um ambiente com Java 25 e um serviço de PostgreSQL, utilizando secrets do GitHub para definir credenciais e variáveis sensíveis de forma segura. Durante o processo, o código é baixado, o ambiente é preparado com arquivos de configuração necessários, e o projeto é compilado utilizando o Gradle Wrapper. Em seguida, são executados testes automatizados com geração de relatório de cobertura via JaCoCo, garantindo a qualidade do código antes da integração.

 <br> 

🔷 `workflow-sonarcloud.yml`, é executado em pull requests e push na branch principal para validar uma aplicação Spring Boot com Gradle. Ele configura Java 25 e um serviço de PostgreSQL, utilizando secrets do GitHub para credenciais, arquivos de configuração e autenticação no SonarCloud. A configuração avançada integra o SonarCloud ao projeto, utilizando cache de pacotes do Gradle e do Sonar para otimizar o desempenho, realizando o build da aplicação e executando testes com geração de relatório JaCoCo. Ao final, é feita a análise de qualidade do código, verificando cobertura, duplicações, code smells e possíveis bugs, garantindo maior confiabilidade antes da integração.

<br>

🔷 `docker-workflow.yml`, automatiza o processo de build e publicação de uma imagem Docker sempre que há um push na branch principal. Ele obtém o código do repositório, extrai automaticamente a versão definida no arquivo build.gradle.kts e utiliza essa informação para versionar a imagem. Em seguida, realiza o login no Docker Hub utilizando secrets do GitHub para autenticação segura, constrói a imagem da aplicação e faz o push para o repositório remoto com a tag correspondente à versão. Por fim, também publica a imagem com a tag latest, garantindo fácil acesso à versão mais recente da aplicação.

<br>

## 🖥️ Desenvolvedor

### 🔵 LinkedIn: [Gustavo Correa](https://www.linkedin.com/in/gustavo-chauar-correa-946168269/)
