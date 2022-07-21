package com.task.taskODT;

public class ODTask {

    private String word = new String();
    private int id;


    public ODTask() {
        setWord("default");
        setID(0);
    }
    public ODTask(String args, Integer id) {
        this.word = args;
        this.id = id;
    }


    public String getWord () {

        return this.word;
    }

    public void setWord (String word) {

        this.word = word;
    }

    public Integer getID () {

        return this.id;
    }

    public void setID (Integer id) {

        this.id = id;
    }




}
