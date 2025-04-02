# Hr_portal
HR Portal
Overview
The HR Portal is a web-based employee management system that allows HR teams to efficiently manage employees, including adding, updating, and deleting employee records. It provides a user-friendly interface built using Vue.js for the frontend and Spring Boot for the backend.

Features
✅ Add new employees with details like name, department, email, and salary
✅ View a list of all employees in a tabular format
✅ Update employee details using a modal form
✅ Delete employee records with a single click
✅ Responsive and professional UI using Bootstrap

Tech Stack
Frontend
Vue.js (Vue CLI)

Fetch API for making API requests

Bootstrap for styling

Backend
Spring Boot

PostgreSQL (or any database used)

RESTful API for communication

Installation & Setup
1. Clone the Repository
bash
Copy
Edit
git clone https://github.com/UjjwalVerma07/Hr_portal.git
cd Hr_portal
2. Backend Setup
Ensure you have Java and Maven installed, then navigate to the backend folder and run:

bash
Copy
Edit
mvn spring-boot:run
This will start the backend server.

3. Frontend Setup
Navigate to the frontend folder and install dependencies:

bash
Copy
Edit
npm install
npm run serve
This will start the Vue.js development server.

API Endpoints
Method	Endpoint	Description
GET	/employees	Fetch all employees
POST	/employees	Add a new employee
PUT	/employees/{id}	Update an employee
DELETE	/employees/{id}	Delete an employee

Contributing
Feel free to contribute by creating pull requests or reporting issues.

Contributor:-
Ujjwal Verma
ujjwalvarma6948@gmail.com
