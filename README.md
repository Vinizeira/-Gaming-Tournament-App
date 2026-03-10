# 🎮 Gaming Tournament App — Java OOP Project

A Java console application that registers players, validates input, and displays a sorted ranking for a gaming tournament.

---

## 📋 About the Project

This project was built as a Java challenge to practice core programming concepts including **Collections, OOP, Sorting, and Error Handling**. The application allows users to create a tournament, register players with their scores, and display a ranked leaderboard.

---

## 🗺️ Mind Map

The mind map was created in **Miro** and used as the main guide to plan and build this project step by step. *(![Mind map](https://github.com/user-attachments/assets/bf48069a-5481-4064-92a3-caa722627c0c)
)*

---

## 🏗️ Project Structure

```
Person (Superclass)
    └── Player (Subclass) implements Comparable<Player>

Main (Entry Point)
```

| Class | Type | Description |
|-------|------|-------------|
| `Person` | Superclass | Base class with `name` attribute |
| `Player` | Subclass | Extends Person, adds `score`, `tournament`, sorting logic |
| `Main` | Entry Point | Handles input, validation, collections, sorting and output |

---

## ⭐ Sorting System

The ranking is sorted using `Comparable` implemented in `Player`:

```
compareTo → Integer.compare(otherPlayer.score, this.score)
```

| sortChoice | Method | Result |
|------------|--------|--------|
| `1` | `Collections.sort(players)` | Score Descending ↓ |
| `2` | `Comparator.comparing(Player::getScore)` | Score Ascending ↑ |
| `3` | `Comparator.comparing(Player::getName)` | Alphabetical A→Z |

---

## 💡 OOP Concepts Applied

**Encapsulation** — All attributes are `private`, accessible only through getters and setters. Example: you can't do `player.score++`, you must use `player.setScore()`.

**Inheritance** — `Player` extends `Person`, reusing the `name` attribute and calling `super(name)` in the constructor, avoiding code repetition.

**Polymorphism** — Different sorting strategies using `Comparator`, allowing the same list to be sorted in multiple ways without changing the `Player` class.

---

## 📊 Expected Output

```
Enter tournament name: 
Copa Java

Enter player name: Ana
Enter score: 1200
Score input processed.
Enter 0 to exit or 1 to continue or 2 to remove player: 1

Enter player name: Carlos
Enter score: 850
Score input processed.
Enter 0 to exit or 1 to continue or 2 to remove player: 0

How do you want to sort the ranking?
1 - Score Descending
2 - Score Ascending
3 - Name Alphabetically

1

Total players: 2

🏆 RANKING - Copa Java:
Ana - 1200 pts (Copa Java)
Carlos - 850 pts (Copa Java)

🏆 The champion of the Copa Java is: Ana - 1200 pts (Copa Java)
```

---

## 🕹️ How to Use

**Step 1 — Enter the tournament name**
```java
Enter tournament name: Copa Java
```

**Step 2 — Register a player**
```java
Enter player name: Ana
Enter score: 1200
```

**Step 3 — Continue, remove or exit**
```java
Enter 0 to exit or 1 to continue or 2 to remove player:
// 1 → add more players
// 2 → remove a player by name
// 0 → finish and go to ranking
```

**Step 4 — Choose sorting**
```java
1 - Score Descending  // best players first
2 - Score Ascending   // lowest score first
3 - Name Alphabetically // A to Z
```

**Step 5 — See the ranking**
```java
🏆 RANKING - Copa Java:
Ana - 1200 pts (Copa Java)
Carlos - 850 pts (Copa Java)

🏆 The champion of the Copa Java is: Ana - 1200 pts (Copa Java)
```

---

## 🛠️ Technologies

- Java 25
- IntelliJ IDEA
- Miro

---

## 👨‍💻 Author

Vinizeira
