# 🗓️ Event-Planner API

An intelligent planning system for events with a focus on data validation and automated testing.

![CI Status](https://github.com/junesdream/event-planner/actions/workflows/ci.yml/badge.svg?branch=main)
![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Framework-Spring_Boot_3.4.5-green)
![Validation](https://img.shields.io/badge/Logic-Bean_Validation-blue)
![License](https://img.shields.io/badge/license-MIT-green)

---

## ✨ Features

| Feature | Description |
|---|---|
| 🛡️ **Smart Validation** | Prevents invalid input (e.g. negative budget or empty title) directly at the endpoint |
| 🧪 **Dual Testing Layer** | Unit tests with Mockito + Integration tests with MockMvc |
| 💾 **H2 Persistence** | Fast in-memory database for development and CI/CD |

---

## 🏗️ Architecture

| Layer | Technology | Responsibility |
|---|---|---|
| **Model** | JPA / Jakarta Validation | Data structure & validation rules |
| **Repository** | Spring Data JPA | Database abstraction |
| **Service** | Spring Service | Business logic & repository calls |
| **Controller** | Spring Web | REST endpoints & `@Valid` trigger |

---

## 🚀 API Reference

| Method | Endpoint | Payload | Status |
|---|---|---|---|
| `GET` | `/api/plans` | — | `200 OK` |
| `POST` | `/api/plans` | `{"title": "...", "budget": 500}` | `200 OK` / `400 Bad Request` |
| `DELETE` | `/api/plans/{id}` | — | `204 No Content` |

---

## 💻 Getting Started

### Run locally
```bash
  mvn spring-boot:run
```

### Run tests
```bash
  mvn test
```

---

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-idea`)
3. Commit your changes (`git commit -m 'feat: add your idea'`)
4. Push to the branch (`git push origin feature/your-idea`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 👤 Author

**June** ([@junesdream](https://github.com/junesdream))
Full-Stack Development • AI Systems • Electronic Music