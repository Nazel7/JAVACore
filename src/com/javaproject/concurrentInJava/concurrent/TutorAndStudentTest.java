package com.javaproject.concurrentInJava.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TutorAndStudentTest {
    public static void main(String[] args) {
        Lock lock= new ReentrantLock();
        Tutor tutor = new Tutor();
        Student student = new Student(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try{
                    tutor.studyTime();
                }finally {
                  lock.unlock();
                }

            }
        });

        Thread studentThread = new Thread(new Runnable() {
            @Override
            public void run()
            {
                lock.lock();
                try{
                    student.handInAssignment();
                }finally {
                    lock.unlock();
                }

            }
        });

        tutorThread.start();
        studentThread.start();
    }
}

class Tutor {
    Lock lock= new ReentrantLock();
    private Student student;

    public  void setStudent(Student student) {
        this.student = student;
    }

    public void studyTime() {
        System.out.println("ConcurrentInJava.Tutor has arrived");
        lock.lock();
        try{
            try {
                // wait for student to arrive and hand in assignment
                Thread.sleep(300);
            }
            catch (InterruptedException e) {

            }
            student.startStudy();
            System.out.println("ConcurrentInJava.Tutor is studying with student");
        }finally {
           lock.unlock();
        }
    }

    public  void getProgressReport() {
        // get progress report
        System.out.println("ConcurrentInJava.Tutor gave progress report");
    }
}

class Student {

    private Tutor tutor;

    Student(Tutor tutor) {
        this.tutor = tutor;
    }

    public  void startStudy() {
        // study
        System.out.println("ConcurrentInJava.Student is studying");
    }

    public  void handInAssignment() {
       synchronized (this){tutor.getProgressReport();
        System.out.println("ConcurrentInJava.Student handed in assignment");
       }
    }
}
