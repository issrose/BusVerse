# 🚌 BusVerse — Intercity & Local Bus Reservation System

A full-stack, responsive web application for bus discovery, live interactive seat selection, and instant boarding pass generation.

---

## ✨ Features

- 🔐 **Passenger Authentication Flow**:
  - Clean registration and sign-in requiring Name, 10-digit Mobile Number, and Gmail.
  - Automatic session management and profile personalization.
- 💺 **Interactive 2+2 Seat Map**:
  - Live seat layout visualizer (Driver Deck, Front Aisle, Window & Aisle seats).
  - Real-time selection highlights and dynamic fare review with 5% GST calculation.
- 🎫 **Instant Boarding Passes & PNR**:
  - Instant ticket confirmation with unique PNR, bus operator details, and digital QR code.
- 🚏 **Stop & Route Explorer**:
  - Over 40 bus stops across Kerala, Karnataka, Tamil Nadu, and Goa with instant route filters.
- 🖥️ **Lightweight Java Backend**:
  - Built-in HTTP server using Java standard library with JSON persistence (`busverse_db.json`).

---

## 🚀 Quick Start

### Prerequisites
- **Java JDK 17+** (or Java 21/26)

### Running Locally
1. Compile the Java server:
   ```bash
   javac -d out src/com/busreservation/server/BusVerseServer.java
   ```
2. Start the server:
   ```bash
   java -cp out com.busreservation.server.BusVerseServer
   ```
3. Open your browser at:
   ```
   http://localhost:5000/
   ```

---

## 📁 Project Structure

```
BusReservationSystem/
├── src/
│   └── com/busreservation/server/
│       └── BusVerseServer.java    # Java HTTP REST API & Static File Server
├── web/
│   ├── index.html                 # Single Page Application Markup & Views
│   ├── app.js                     # Frontend Engine, Seat Selection & Auth Logic
│   └── app.css                    # Design System & Responsive Styling
├── busverse_db.json               # JSON Database (Stops, Routes, Buses, Bookings)
├── schema.sql                     # SQL schema reference
└── .gitignore
```

---

## 🛡️ License
MIT License
