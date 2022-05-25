package com.sora.gcdr.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.sora.gcdr.db.Task;
import com.sora.gcdr.db.TaskRepository;

import java.util.List;

public class TaskViewModel extends AndroidViewModel {
    private final TaskRepository repository;

    private int year;
    private int month;
    private int day;

    public TaskViewModel(@NonNull Application application) {
        super(application);
        repository = new TaskRepository(application);
    }

    public void addTask(Task task) {
        repository.insert(task);
    }

    public LiveData<List<Task>> getDayTaskLive() {
        return repository.getDayTaskLive();
    }
    public void updateDayTaskLive() {
        repository.setDayTasksLive(year,month,day);
    }


    public TaskRepository getRepository() {
        return repository;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDate() {
        return year + "-" + month + "-" + day;
    }
}
