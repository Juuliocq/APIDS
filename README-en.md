You can also read this document in [portuguese](README.md).

# Sellers and Sales statistics visualization dashboard.

It was developed on the Semana Spring React course from DevSuperior school, you can acces the original project [here](https://github.com/acenelio/projeto-sds3). 
<br/>
You can also acces my version of the project by clicking [here](https://salesdashboardapi.netlify.app/).
<br/>

Uses the following technologies:
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

## Things i learned:
<br/>

- Cloud deploy with Heroku for backend and Netlify for frontend, using techniques of CI/CD.
- Ambient profiles configuration (test, development and production). <br/>
- Using of H2 embed database in test profile (spring.h2.console.path configuration). <br/>
- Setting to release CORS(Cross-Origin Resource Sharing) in backend, which allows frontend (Netlify) to freely access backend resources (Heroku). <br/>
<br/>

## Things i changed from the original project: 
<br/>

- ModelMapper implementation for Model <> DTO conversion instead conversion by constructor. <br/>
