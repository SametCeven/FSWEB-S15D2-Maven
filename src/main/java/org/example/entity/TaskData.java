package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks = new HashSet<>();
    private Set<Task> bobsTasks = new HashSet<>();
    private Set<Task> carolsTasks = new HashSet<>();
    private Set<Task> unassignedTasks = new HashSet<>();

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks){
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String person){
        if(person.equals("ann")){
            return annsTasks;
        }else if(person.equals("bob")){
            return bobsTasks;
        }else if(person.equals("carol")){
            return carolsTasks;
        }else if(person.equals("all")){
            annsTasks.addAll(bobsTasks);
            annsTasks.addAll(carolsTasks);
            annsTasks.addAll(unassignedTasks);
            return annsTasks;
        }
        return null;
    }

    public Set<Task> getUnion(Set<Task> task1, Set<Task> task2){
        task1.addAll(task2);
        return task1;
    }
    public Set<Task> getIntersection(Set<Task> task1, Set<Task> task2){
        task1.retainAll(task2);
        return task1;
    }
    public Set<Task> getDifferences(Set<Task> task1, Set<Task> task2){
        task1.removeAll(task2);
        return task1;
    }



}
