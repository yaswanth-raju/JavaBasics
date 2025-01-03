package InterviewPrograms.ProblemSovling;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Fork {
    private final Lock lock = new ReentrantLock();

    public void pickUp() {
        lock.lock();
    }

    public void putDown() {
        lock.unlock();
    }
}

class Philosopher extends Thread {
    private final Fork leftFork;
    private final Fork rightFork;
    private final int philosopherNumber;

    public Philosopher(int philosopherNumber, Fork leftFork, Fork rightFork) {
        this.philosopherNumber = philosopherNumber;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        while (true) {
            think();
            pickUpForks();
            eat();
            putDownForks();
        }
    }

    private void think() {
        System.out.println("Philosopher " + philosopherNumber + " is thinking.");
        try {
            Thread.sleep((int) (Math.random() * 100));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void pickUpForks() {
        if (philosopherNumber % 2 == 0) {
            rightFork.pickUp();
            leftFork.pickUp();
        } else {
            leftFork.pickUp();
            rightFork.pickUp();
        }
    }

    private void eat() {
        System.out.println("Philosopher " + philosopherNumber + " is eating.");
        try {
            Thread.sleep((int) (Math.random() * 100));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void putDownForks() {
        leftFork.putDown();
        rightFork.putDown();
    }
}

public class DiningPhilosophers {
    public static void main(String[] args) {
        Fork[] forks = new Fork[5];
        Philosopher[] philosophers = new Philosopher[5];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Fork();
        }

        for (int i = 0; i < philosophers.length; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % forks.length];

            philosophers[i] = new Philosopher(i, leftFork, rightFork);
            philosophers[i].start();
        }
    }
}
