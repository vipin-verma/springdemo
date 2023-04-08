package org.springdemo.reference.lifecycle;

public class School {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public School(String subject) {
        this.subject = subject;
    }

    public School() {
    }

    @Override
    public String toString() {
        return "School{" +
                "subject='" + subject + '\'' +
                '}';
    }



    public void start(){
        System.out.println("starting method");
    }

    public void end(){
        System.out.println("ending method");
    }


}
