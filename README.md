# MVP-project
Tic-Tac-Toe Java Console MVP
MVP Overview

This is a two-player Tic-Tac-Toe console game written in Java. Players choose X or O, take turns selecting grid positions, and the game tracks wins and scores across multiple rounds.

How to Compile and Run
javac *.java
java main
OOP Concepts with File References
1.Classes and Objects (V1.0 & V2.0)

Classes are used to model the game system:

player.java → base player class
userint.java → extended player with score and symbol
board.java → game board object
elements.java → board cell objects

Object creation:

main.java lines ~17–23
userint P1 = new userint(X, S1, 0);
board B = new board();
2.Encapsulation (V1.0 & V2.0)

Private fields protect data:

player.java → private String name
userint.java → private String symb, private int score

Getters and setters:

userint.java lines ~10–25
public String getsymb()
public void setsymb(String symb)
public int getscore()
3.Inheritance (V3.0)
userint.java extends player.java

This allows reuse of:

name field
displayinfo method (overridden in subclass)
4.Polymorphism (V4.0)

Method Overriding:

player.java → displayinfo()
userint.java → overrides displayinfo()

Usage:

main.java lines ~20–25
player dat1 = P1;
dat1.displayinfo();

Method Overloading:

board.java
showboard()
showboard(String header, String footer)
Files Overview
main.java – game loop and input
board.java – board display logic
elements.java – grid cells
player.java – base player class
userint.java – extended player class
gameart.java – ASCII UI