# ⚡ Real-Time Bidding & Auction Platform

> **A production-grade real-time auction platform built from the ground up, in public, over 130 days.**

This repository documents my journey of designing, building, testing, deploying, and evolving a **real-world distributed auction system** — from a single Java application to a scalable microservices architecture.

The goal is not simply to build another auction application.

The goal is to understand **how production systems are designed, built, scaled, secured, deployed, monitored, and maintained.**

---

## 📅 The Journey

|                       | Date                 |
| --------------------- | -------------------- |
| **Started**           | 12 August 2026       |
| **Target Completion** | 05 February 2027     |
| **Duration**          | 130 Development Days |
| **Status**            | 🟢 In Progress       |

Every development day introduces new concepts while continuously improving the same system.

The project begins with **Java fundamentals** and progressively evolves into a production-ready distributed platform.

---

## 🎯 The Project

The platform allows users to participate in **live online auctions** where they can:

* Create and manage auction listings
* Discover active and upcoming auctions
* Join auctions in real time
* Place competing live bids
* Receive bid updates instantly
* Fund an internal wallet
* Lock funds in escrow before bidding
* Automatically determine auction winners
* Process payments and settlements
* Receive real-time notifications
* View bidding and transaction history

The long-term target is to support **thousands of simultaneous auction participants** while broadcasting bid updates with a target latency of:

> **< 300ms**

---

## 🏗️ Engineering Goals

This project is designed to explore more than framework syntax.

It focuses on the engineering decisions behind production systems:

**Backend Engineering**

* Java
* Spring Boot
* REST API design
* Authentication & authorization
* Database design
* Transaction management
* Validation & error handling
* Testing strategies

**Distributed Systems**

* Microservices architecture
* Event-driven architecture
* Apache Kafka
* Redis
* WebSockets
* Distributed transactions
* Idempotency
* Concurrency control
* Race-condition handling

**Infrastructure & DevOps**

* Docker
* CI/CD
* AWS
* Cloud infrastructure
* Logging
* Monitoring
* Observability
* Performance testing
* Horizontal scaling

**Frontend & Mobile**

* Vue 3
* Flutter
* Real-time client communication

---

## 🛠️ Technology Stack

```text
Java 21
   ↓
Spring Boot
   ↓
MySQL/PostgreSQL
   ↓
Redis
   ↓
Docker
   ↓
AWS
   ↓
Apache Kafka
   ↓
Microservices
   ↓
Vue 3 + Flutter
```

### Core Technologies

| Area                    | Technology    |
| ----------------------- | ------------- |
| Language                | Java 21       |
| Backend                 | Spring Boot   |
| Database                | MySQL         |
| Cache                   | Redis         |
| Messaging               | Apache Kafka  |
| Architecture            | Microservices |
| Containers              | Docker        |
| Cloud                   | AWS           |
| Web Client              | Vue 3         |
| Mobile Client           | Flutter       |
| Real-Time Communication | WebSockets    |

---

## 🧠 Architecture Evolution

The architecture will intentionally evolve throughout the project.

```text
Java Application
       │
       ▼
Spring Boot Monolith
       │
       ▼
REST API
       │
       ├── MySQL
       │
       └── Redis
       │
       ▼
Dockerized Application
       │
       ▼
AWS Deployment
       │
       ▼
Event-Driven Architecture
       │
       └── Apache Kafka
       │
       ▼
Microservices
       │
       ├── User Service
       ├── Auction Service
       ├── Bidding Service
       ├── Wallet Service
       ├── Payment Service
       └── Notification Service
       │
       ▼
Vue 3 Web Application
       +
Flutter Mobile Application
```

This progression is intentional: **understand the foundations first, then introduce complexity when the system actually needs it.**

---

## 🗺️ Roadmap

The 130-day journey moves progressively through several engineering stages:

```text
Java Fundamentals
        ↓
Object-Oriented Programming
        ↓
Advanced Java
        ↓
Spring Boot
        ↓
Database Engineering
        ↓
REST APIs
        ↓
Authentication & Security
        ↓
Testing
        ↓
Redis & Caching
        ↓
Real-Time Bidding
        ↓
Docker
        ↓
AWS
        ↓
Kafka
        ↓
Event-Driven Architecture
        ↓
Microservices
        ↓
Observability
        ↓
Performance & Scaling
        ↓
Vue 3
        ↓
Flutter
        ↓
Production Deployment
```

---

## 📈 Progress

### Foundation

* [x] **Day 1** — Development environment setup
* [ ] **Day 2** — Variables, types & operators
* [ ] **Day 3** — Control flow
* [ ] **Day 4** — Methods & program structure
* [ ] **Day 5** — Classes & objects

More milestones will be added as the platform evolves.

---

## ⚙️ Target System

By the end of the journey, the platform should demonstrate:

* Real-time competitive bidding
* Thousands of concurrent connections
* `< 300ms` bid propagation target
* Reliable event processing
* Wallet and escrow management
* Secure authentication and authorization
* Transaction consistency
* Race-condition protection
* Idempotent operations
* Event-driven communication
* Horizontally scalable services
* Automated testing
* CI/CD pipelines
* Production monitoring and observability
* Cloud deployment

---

## 💡 Why Build This in Public?

Knowing a programming language is different from knowing how to **engineer a system**.

This project is about closing that gap.

Instead of building isolated tutorial applications, I am taking **one system** and continuously evolving it as I learn and apply increasingly advanced engineering concepts.

Every architectural decision, mistake, refactor, performance problem, and solution becomes part of the journey.

---

## 📖 Follow the Journey

I will be sharing development updates, engineering decisions, lessons learned, architecture changes, and progress throughout the 130-day build.

**LinkedIn:**
[linkedin.com/in/kibagendi](https://www.linkedin.com/in/kibagendi)

**X:**
[@wes_kibagendi](https://x.com/wes_kibagendi)

---

## 👨‍💻 Author

**Wes Kibagendi**

Software Engineer focused on backend engineering, distributed systems, cloud infrastructure, and building production-grade software.

Connect with me:

[LinkedIn](https://www.linkedin.com/in/kibagendi) • [X / Twitter](https://x.com/wes_kibagendi)

---

## ⭐ Follow the Build

If you are interested in:

`Java` • `Spring Boot` • `System Design` • `Distributed Systems` • `Kafka` • `Microservices` • `AWS` • `Real-Time Systems`

**Star the repository and follow the journey.**

---

> **One system. 130 development days. From Java fundamentals to production-scale distributed architecture.**
