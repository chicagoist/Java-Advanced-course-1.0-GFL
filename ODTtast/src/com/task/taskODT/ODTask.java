package com.task.taskODT;

//import java.lang.Override;

import java.util.Objects;

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


    public String getWord() {

        return this.word;
    }

    public void setWord(String word) {

        this.word = word;
    }

    public Integer getID() {

        return this.id;
    }

    public void setID(Integer id) {

        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ODTask odtask = (ODTask) o;
        return Objects.equals(word, odtask.word) && Objects.equals(id, odtask.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, id);
    }


}
