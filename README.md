# 🎵 Audio Application — Java OOP Project
A Java application that simulates an audio streaming platform,
managing music and podcasts with an automatic rating system.

---

## 📋 About the Project
This project was built independently, based on a mind map I created myself
without following video lessons. The mind map was used as the only guide
to structure and code the entire application.

---

## 🗺️ Mind Map
> The mind map was created in Miro by me, and used as the only guide to build this project.
> [Click here to view the full mind map](https://miro.com/welcomeonboard/d3RkLzdKS21teFVHSjRZMU1mVnd0WWlUbUk0NSsrNmN2bXJoUFlVMGtYU3FqNGprNjU5QVBFNHUvSXBuT01tTzJVdWlnWnJXRmVtWmRCTk1QVzhTV2duRURSMm50azlwRjdlcmN1Tm4wRnhOUXJUcFdRcTZlenhnWWUyVVNFZzZNakdSWkpBejJWRjJhRnhhb1UwcS9BPT0hdjE=?share_link_id=150684704325)

---

## 🏗️ Project Structure
```
Playable (Interface)
    └── Audio (Superclass)
            ├── Music (Subclass)
            └── Podcast (Subclass)
```

| Class | Type | Description |
|---|---|---|
| Playable | Interface | Contract defining play(), like(), getRating() |
| Audio | Superclass | Base class with shared attributes and methods |
| Music | Subclass | Extends Audio, adds artist, album, genre |
| Podcast | Subclass | Extends Audio, adds host, description, episodeNumber |

---

## ⭐ Rating System

The rating is automatically calculated based on plays and likes:
```
rating = (double) likes / totalPlays * 5
```

| Plays | Likes | Rating |
|---|---|---|
| 4 | 3 | 3.75 ⭐ |
| 5 | 2 | 2.0 ⭐ |
| 3 | 3 | 5.0 ⭐ |
| 4 | 1 | 1.25 ⭐ |

Audios with rating >= 3.0 are considered favorites.

---

## 💡 OOP Concepts Applied

**Encapsulation** — All attributes are private, accessible only through public
methods. Example: you can't do `audio.totalPlays++`, you must use `audio.play()`.

**Inheritance** — Music and Podcast inherit all attributes and methods from Audio,
avoiding code repetition. Example: `Podcast extends Audio`.

**Polymorphism** — Both types are stored in a single `List<Playable>`, and the
same loop works for all of them regardless of their type.

---

## 📊 Expected Output
```
=== All Audios ===
Music: Wonderwall | Artist: Oasis | Album: (What's the Story) Morning Glory? | Genre: Britpop
Rating: 3.75 ⭐
-------------------
Music: Boulevard of Broken Dreams | Artist: Green Day | Album: American Idiot | Genre: Punk Rock
Rating: 2.0 ⭐
-------------------
Podcast: The Alibi | Host: Sarah Koenig | Episode: 1
Rating: 5.0 ⭐
-------------------
Podcast: How to Improve Your Focus | Host: Andrew Huberman | Episode: 2
Rating: 1.25 ⭐
-------------------

=== Favorites (rating >= 3.0) ===
Music: Wonderwall | Artist: Oasis | Album: (What's the Story) Morning Glory? | Genre: Britpop
Rating: 3.75 ⭐
-------------------
Podcast: The Alibi | Host: Sarah Koenig | Episode: 1
Rating: 5.0 ⭐
-------------------
```

---

## ✅ Coding Checklist

The order used to build the project:

- [x] Step 1: Playable interface (methods, no bodies)
- [x] Step 2: Audio superclass (attributes, constructor, methods)
- [x] Step 3: Podcast subclass (extends Audio, super(), extra attributes)
- [x] Step 4: Music subclass (extends Audio, super(), extra attributes)
- [x] Step 5: Main class (create objects, store in collection, simulate behavior, filter, print)

---

## 🛠️ Technologies

- Java 25
- IntelliJ IDEA

---

## 👨‍💻 Author

Vinizeira
