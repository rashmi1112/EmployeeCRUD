# EmployeeCRUD
Microservice performing CRUD operations on DB coupled with orchestration front-end microservice that consumes the first one.

• A CRUD microservice that connects to an Employee table with the help of JDBC template and performed DB
operations using JDBC queries



• A front-end facing fault tolerant microservice (Employee Orchestration) consumed the Employee CRUD service to
perform consumer needs operations. These services were registered onto a Eureka server for service discovery and
load balancing
