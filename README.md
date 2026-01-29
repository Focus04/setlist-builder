# 🎵 SetList Builder

> A full-stack Festival Management System built with Spring Boot and MySQL.

**SetList Builder** is a web application designed to help festival organizers manage their lineups. It allows users to curate a database of musicians and songs, and schedule them onto specific festival stages with pricing and timing details.

---

## 🚀 Live Demo
The application is deployed on Railway and can be accessed **[here](https://setlist-builder.up.railway.app/)**.

---

## ✨ Features

### 🎸 Artist Management (`/musicieni`)
* Add, edit, and remove artists from the festival roster.
* Categorize musicians by genre (Rock, Pop, Jazz, etc.).

### 💿 Track Curation (`/melodii`)
* Manage a library of songs available for performance.
* Track details include duration and genre.

### 🎪 Stage & Concert Scheduling (`/concerte`)
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
* Java Development Kit (JDK) 21 or higher
* MySQL Server (if running locally)
* Maven

### 1. Clone the Repository
```bash
git clone https://github.com/focus04/setlist-builder.git
cd setlist-builder
```