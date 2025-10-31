# 🏦 Bank Management System

A **Java-based Bank Management System** built using **Swing**, **AWT**, and **MySQL** to perform essential banking operations through an interactive graphical user interface. This project demonstrates database integration using **JDBC** for reliable data storage and retrieval.

---

## 🚀 Features

- 🧾 **Account Management:** Create, view, and manage customer accounts.  
- 💰 **Transaction Handling:** Perform deposits, withdrawals, and balance inquiries.  
- 📄 **Mini Statement:** Generate recent transaction history for each account.  
- 🖥️ **Graphical Interface:** Built using Java **Swing** and **AWT** for smooth user experience.  
- 🗄️ **Database Integration:** MySQL database connected through **JDBC** for secure data persistence.  
- ⚙️ **Error Handling:** Includes validation for incorrect inputs and database operations.

---

## 🧩 Tech Stack

| Component | Technology Used |
|------------|----------------|
| **Frontend (GUI)** | Java Swing, AWT |
| **Backend Logic** | Java (OOP principles) |
| **Database** | MySQL |
| **Connectivity** | JDBC (Java Database Connectivity) |
| **IDE Used** | Eclipse / IntelliJ IDEA(I used this) / NetBeans (any Java IDE) |

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository

git clone https://github.com/Sairamesh2695/Bank-Management-System.git

### 2️⃣ Import into IDE

  - Open the project in your preferred Java IDE.
  
  - Ensure JDK (Java Development Kit) is properly configured.

### 3️⃣ Setup MySQL Database

  - Create a new database (e.g., bankdb).
  
  - Import the provided .sql file (if available)

### 4️⃣ Configure Database Connection

  - Update the JDBC connection settings in your Java code:
  
       String url = "jdbc:mysql://localhost:3306/bankdb";
      
       String user = "root";
      
       String password = "yourpassword";
      
       Connection con = DriverManager.getConnection(url, user, password);

### 5️⃣ Run the Application

  - Compile and run the main Java file.
  
  - Interact with the GUI to perform operations.

---

## 📚 Learning Objectives

  - Understanding JDBC connectivity in Java.
  
  - Designing desktop applications with Swing and AWT.
  
  - Implementing CRUD operations in MySQL.
  
  - Managing real-world data with database relationships.

---

## 💡 Future Enhancements

  - Add user authentication with login credentials.
  
  - Implement interest calculation and loan management.
  
  - Integrate report generation using PDF or Excel export.
  
  - Migrate to a Spring Boot or JavaFX-based architecture for scalability.

---
## 👨‍💻 Author

P Sai Ramesh Kumar

📧 [sairameshkumarp@gmail.com]

💻 Personal Project developed to strengthen Java and database integration skills.
