# 🎵 SetList Builder

**SetList Builder** is a web application designed to help festival organizers manage their lineups. It allows users to curate a database of musicians and songs, and schedule them onto specific festival stages with pricing and timing details.

---

## 🚀 Live Demo
The application is deployed on Railway and can be accessed **[here](https://setlist-builder.up.railway.app/)**.

---

## ✨ Features

### 🎸 Manage Artists (`/musicieni`)
* Add, edit, and remove artists from the festival roster.
* Categorize musicians by genre (Rock, Pop, Jazz, etc.).

### 💿 Curate Tracks (`/melodii`)
* Manage a library of songs available for performance.
* Track details include duration and genre.

### 🎪 Schedule Concerts (`/concerte`)
* **The Core Feature:** Link Artists and Tracks to create a Concert event.
* Set ticket prices, start times, and end times.
* Foreign Key relationships ensure data integrity (you can't schedule a non-existent artist).

### 🎨 User Interface
* **Responsive Design:** Built with **Bootstrap 5** for mobile and desktop compatibility.
* **Dynamic Backgrounds:** Custom CSS styling with thematic background images for each section.
* **Landing Page:** A modern home dashboard with quick navigation cards.

---

## 🛠️ Tech Stack

* **Backend:** Java 21 and Spring Boot 3
* **Database:** MySQL (Local & Remote via Railway)
* **Frontend:** Thymeleaf, HTML5, Bootstrap 5, Bootstrap Icons
* **Build Tool:** Maven
* **Deployment:** Railway (Cloud Platform)

---

## ⚙️ Configuration & Setup

### Prerequisites
* Java Development Kit 21
* MySQL Server (if running locally)
* Maven

### 1. Clone the Repository
```bash
git clone https://github.com/focus04/setlist-builder.git
cd setlist-builder
```

### 2. Database Configuration
The application uses application.properties to switch between local and remote environments.
For Local Development:
Update src/main/resources/application.properties:
```properties
server.port=8080
spring.application.name=SetListBuilder

spring.datasource.url=jdbc:mysql://localhost:3306/YOUR_LOCAL_DB?useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=YOUR_LOCAL_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

For Railway (Production):
The app automatically detects Railway environment variables:
```properties
server.port=${PORT:8080}
spring.application.name=SetListBuilder

spring.datasource.url=jdbc:mysql://${MYSQLHOST}:${MYSQLPORT}/${MYSQL_DATABASE}
spring.datasource.username=${MYSQLUSER}
spring.datasource.password=${MYSQLPASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Run the App
You can run the application using Maven:
```properties
mvn spring-boot:run
```
Once running, open your browser and go to: http://localhost:8080