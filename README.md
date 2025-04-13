<a name="readme-top"></a>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <img src="./public/favicon.ico" alt="Logo" width="80" height="80">

  <h3 align="center">Zuko Dormitory Management</h3>

  <p align="center">
    A full-stack dormitory management system built with SpringBoot, React, and TypeScript.
    <br />
    <br />
    <a href="#">Live Demo</a>
    ·
    <a href="https://github.com/your-username/zuko-dormitory-management/issues">Report Bug</a>
    ·
    <a href="https://github.com/your-username/zuko-dormitory-management/issues">Request Feature</a>
  </p>
</div>

---

## 🧭 Table of Contents

<details>
  <summary>Click to expand</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#tech-stack">Tech Stack</a></li>
    <li><a href="#features">Features</a></li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#project-structure">Project Structure</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
  </ol>
</details>

---

## 📖 About The Project

Zuko Dormitory Management System is a modern, full-stack web application for managing dormitory facilities, student records, room allocations, and administrative operations.

Whether you're an admin managing dozens of residents or a student checking in, the system simplifies your workflow with an intuitive UI and secure backend.

---

## ⚙️ Tech Stack

-   🎯 **Backend**: Spring Boot, Spring Security, Spring Data JPA, Hibernate
-   🛢️ **Database**: PostgreSQL
-   💅 **Frontend**: React.js + TypeScript
-   ⚙️ **Build Tool**: Gradle
-   🚀 **Dev Tools**: Spring Boot DevTools, Postman
-   📦 **ORM**: JPA / Hibernate
-   🔐 **Auth**: JWT (Coming Soon)
-   🧪 **Testing**: JUnit, Mockito

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## 🚀 Features

-   🏢 Room & Resident Management
-   🔐 Secure Login for Admin & Users
-   📊 Dashboard for Real-Time Insights
-   📝 Room Allocation & Vacating
-   📬 Notifications (Coming Soon)
-   🌐 RESTful APIs
-   ⚡ Hot-reload (Spring DevTools)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## 🛠️ Getting Started

### 🔧 Prerequisites

-   Java 21
-   PostgreSQL
-   Gradle (or use `./gradlew`)
-   Node.js & npm (for React frontend)

### 🔌 Backend Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/zuko-dormitory-management.git
    cd zuko-dormitory-management
    ```

2. Configure `application.properties`:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/zuko_db
    spring.datasource.username=postgres
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

3. Start the backend:
    ```bash
    ./gradlew bootRun
    ```

### 🌐 Frontend Setup

1. Navigate to frontend directory:

    ```bash
    cd frontend
    ```

2. Install dependencies:

    ```bash
    npm install
    ```

3. Start the development server:
    ```bash
    npm run dev
    ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## 🗂️ Project Structure

```
📦 zuko-dormitory-management
├── backend/
│   └── src/main/java/com/zuko/dormitorymanagement
│       ├── config/
│       ├── controller/
│       ├── service/
│       ├── repository/
│       ├── model/
│       └── ZukoDormitoryManagementApplication.java
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── services/
│   │   └── App.tsx
│   └── public/
```

---

## 🗺️ Roadmap

-   [x] Spring Boot Backend Setup
-   [x] PostgreSQL Integration
-   [x] CRUD for Students & Rooms
-   [ ] JWT Auth System
-   [ ] Admin Dashboard (React)
-   [ ] Notifications via Email
-   [ ] Dockerize Full App

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## 🤝 Contributing

Contributions are what make the open-source community amazing! If you have suggestions to improve this project, feel free to fork and PR:

1. Fork it
2. Create a branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 🪪 License

Distributed under the MIT License. See `LICENSE` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>
