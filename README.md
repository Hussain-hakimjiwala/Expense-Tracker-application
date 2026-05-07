# Expense Tracker Application

A full-stack Expense Tracker application developed using HTML, CSS, JavaScript, and Core Java.

This project allows users to add and manage daily expenses through a simple web interface while handling backend operations using Java HTTP Server and file handling.

---

## Features

- Add daily expenses
- Expense category management
- Real-time expense submission
- Java backend integration
- File handling-based data storage
- REST-style API communication
- Responsive and simple UI

---

## Technologies Used

- HTML5
- CSS3
- JavaScript
- Core Java
- Java HTTP Server
- File Handling
- VS Code

---

## Project Structure

```text
ExpenseTracker/
│
├── src/
│   └── Main.java
│
├── web/
│   ├── index.html
│   ├── style.css
│   └── script.js
│
└── expenses.txt
```

---

## How It Works

1. User enters expense details in the browser UI
2. JavaScript sends data using Fetch API
3. Core Java HTTP Server receives the request
4. Expense data is stored using Java File Handling

---

## How to Run the Project

### Step 1 — Compile Java File

```bash
cd src
javac Main.java
```

### Step 2 — Run Java Server

```bash
java Main
```

Server will start at:

```text
http://localhost:8080
```

### Step 3 — Run Frontend

Open `index.html` using Live Server in VS Code.

---

## Future Improvements

- Expense history table
- Expense deletion
- Monthly reports
- Category filters
- Dashboard analytics
- Database integration

---

## Author

Hussain Hakimji
