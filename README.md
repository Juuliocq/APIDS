Você pode ler esse documento também em [inglês](README-en.md).

# Dashboard de visualização de estatisticas de vendas e vendedor.

Foi desenvolvido junto ao curso Semana Spring React ministrado pela escola DevSuperior, você pode acessar o repositório original clicando [aqui](https://github.com/acenelio/projeto-sds3). 
<br/>
Você também pode acessar a minha versão do projeto em nuvem clicando [aqui](https://salesdashboardapi.netlify.app/).
<br/>

Foi desenvolvido utilizando as seguintes tecnologias: 
<br/>

Backend: 
<br/>

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/>
<img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white"/>
<img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white"/>
<img src="https://img.shields.io/badge/Heroku-430098?style=for-the-badge&logo=heroku&logoColor=white"/>

Frontend:
<br/>

<img src="https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB"/>
<img src="https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white"/>
<img src="https://img.shields.io/badge/Netlify-00C7B7?style=for-the-badge&logo=netlify&logoColor=white"/>
<br/>
<br/>

## Coisas que aprendi:
<br/>

- Deploy da API em nuvem com Heroku e deploy do frontend no Netlify, usando técnicas de CI/CD.
- Configuração de perfis de ambiente (teste, desenvolvimento e produção). <br/>
- Utilização de banco de dados H2 embutido e gerenciamento via browser (configuração spring.h2.console.path). <br/>
- Configuração para liberar o CORS(Cross-Origin Resource Sharing) no backend, que permite que o frontend (Netlify) possa acessar livremente recursos do backend (Heroku). <br/>
<br/>
<br/>

## Coisas que modifiquei em relação ao projeto original: 
<br/>

- Implementação do ModelMapper para fazer a conversão Model <> DTO em vez de fazer a conversão via construtor. <br/>
