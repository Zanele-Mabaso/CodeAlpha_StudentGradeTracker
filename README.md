 Who it's for and what problem it solves

A simple desktop tool for recording students' scores
in one place, with validation so bad data (blank names, impossible scores,
duplicate IDs) never gets stored.

Design decisions

- Model and UI are separate. Student and GradeTracker know nothing about
  the window, so the interface could change without touching the rules.
- Validation lives in the setters. The constructor calls them, so an invalid
  Student can never exist.
- Student ID is a String. IDs are identifiers, not numbers to calculate
  with, and a String keeps leading zeros.
- JavaFX over Swing.I chose JavaFX early because it is modern, actively
  developed, and supports CSS styling. After learning the basics I compared it
  with Swing. Swing ships with the JDK and needs no setup, while JavaFX is a
  separate dependency, so JavaFX cost me extra setup time. I kept it because
  styling and current tooling mattered to me more than setup effort.
- Maven for the build. I first set JavaFX up by hand, with a downloaded SDK
  and module-path flags. Maven moved that setup into pom.xml, so the project
  now runs with one command.

What I learned

Design decisions matter even in a small project: how the code is structured,
how the app looks, where the logic lives, who it is for, what problem it
solves, and whether I have the skills to build it. Setting up tools is part of
the work too, not something that happens before it. If I did this task again,
I would make those decisions, including Swing versus JavaFX, before writing any
code, instead of while building it.

Author

Zanele Mabaso, CodeAlpha Java Programming Intern