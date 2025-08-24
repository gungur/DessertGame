# Dessert in the Desert JavaFX Game

A simple JavaFX game where players must find and click the "Dessert" button among multiple "Desert" buttons to score points.

## 🎮 Game Description

The Dessert in the Desert game challenges players to quickly identify and click the single "Dessert" button hidden among seven "Desert" buttons. The buttons are randomly positioned on the screen after each click, making the game both fun and challenging.

## 🎯 How to Play

1. **Objective**: Find and click the button labeled "Dessert"
2. **Scoring**:
   - +1 point for clicking the "Dessert" button
   - -1 point for clicking any "Desert" button
3. **Gameplay**: Buttons randomly reposition after each click
4. **Exit**: Use the "Exit" button to quit the game

## 🛠️ Technologies Used

- **JavaFX**: GUI framework for creating the game interface
- **Java**: Programming language
- **Random Class**: For generating random button positions

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- JavaFX SDK

### Compilation and Execution

1. **Compile the game**:
   ```bash
   javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls DessertGame.java
   ```

2. **Run the game**:
   ```bash
   java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls DessertGame
   ```

### Alternatively, use an IDE:
1. Import the project into your favorite Java IDE (IntelliJ, Eclipse, etc.)
2. Configure JavaFX module path in your IDE settings
3. Run the `DessertGame` class

## 🎨 Features

- **Randomized Layout**: Buttons appear in random positions after each click
- **Score Tracking**: Real-time score display
- **Exit Functionality**: Clean game exit button
- **Responsive Design**: 640x480 pixel game window
- **Focus Management**: Exit button maintains focus during gameplay

## 📊 Game Components

- **8 Interactive Buttons**: 1 "Dessert" + 7 "Desert" buttons
- **Score Label**: Displays current score in the top-left corner
- **Exit Button**: Located in the bottom-right corner
- **Main Game Pane**: Central area where buttons appear randomly

## 🔧 Code Overview

The game uses:
- `BorderPane` for main layout organization
- `Random` class for button positioning
- Event handlers for button interactions
- JavaFX properties for dynamic score updates

## 🎯 Game Strategy

- Look carefully before clicking - buttons look similar!
- The "Dessert" button is the only one with two 's' characters
- Buttons move after each click, so stay focused!
