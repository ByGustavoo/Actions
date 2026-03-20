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

🔷 `workflow.yml`, é executado a cada `pull requests` para a branch `main`, garantindo que a aplicação Spring Boot esteja compilando corretamente antes da integração. Ele realiza o checkout do código, configura o ambiente com Java 25 e prepara o Gradle Wrapper para execução. Em seguida, executa o build do projeto, ignorando os testes, com o objetivo de validar rapidamente a compilação e identificar possíveis erros no código.

 <br> 

🔷 `workflow-V2.yml`, é executado a cada `pull requests` para validar uma aplicação Spring Boot com Gradle. Ele configura o ambiente com Java 21 e um PostgreSQL 16 com healthcheck, garantindo que o banco esteja disponível antes da execução, utilizando secrets do GitHub para gerenciar credenciais e arquivos de configuração com segurança.

Durante a execução, o código é obtido do repositório e o pipeline é otimizado com cache automático do Gradle. O projeto é então compilado com o Gradle Wrapper, executando testes automatizados e gerando relatório de cobertura com JaCoCo em uma única etapa. Ao final, o workflow assegura que o código esteja estável, testado e pronto para integração.

 <br> 

🔷 `workflow-sonarcloud.yml`, é executado em `pull requests` e push na branch `main` para validar uma aplicação Spring Boot. Ele configura o ambiente com Java 21 e um PostgreSQL 16 com healthcheck, garantindo que o banco esteja disponível antes da execução, utilizando secrets do GitHub para gerenciar credenciais e arquivos sensíveis com segurança. 

Durante o processo, o código é obtido do repositório e o pipeline é otimizado com cache do Gradle e do Sonar, reduzindo o tempo de execução. Em seguida, o projeto é compilado com o Gradle Wrapper, executando testes automatizados e gerando relatório de cobertura com JaCoCo. Por fim, é realizada a análise de qualidade com Sonar, identificando possíveis bugs, vulnerabilidades, duplicações e code smells, assegurando maior qualidade e confiabilidade antes da integração do código.

<br>

🔷 `docker-workflow.yml`, automatiza o processo de build e publicação de uma imagem Docker sempre que há um push na branch `main`. Ele obtém o código do repositório, extrai automaticamente a versão definida no arquivo `build.gradle.kts` e utiliza essa informação para versionar a imagem. Em seguida, realiza o login no Docker Hub utilizando secrets do GitHub para autenticação segura, constrói a imagem da aplicação e faz o push para o repositório remoto com a tag correspondente à versão. Por fim, também publica a imagem com a tag `latest`, garantindo fácil acesso à versão mais recente da aplicação.

<br>

## 🖥️ Desenvolvedor

### 🔵 LinkedIn: [Gustavo Correa](https://www.linkedin.com/in/gustavo-chauar-correa-946168269/)
