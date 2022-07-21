package com.task.taskODT;


public class Main {
    public static void main(String[] args) {


        ODTask task = new ODTask();
        System.out.println(task.getWord());
        System.out.println(task.getID());

        task.setWord("HelloWorld");
        task.setID(666);
        System.out.println(task.getWord());
        System.out.println(task.getID());

        ODTask worD = new ODTask("HelloWorlD ",15);
        System.out.println(worD.getWord());
        System.out.println(worD.getID());
    }
}