package com.techtalk;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class Talk {

    @Id
    private String id;

    private String presenter;
    private String topic;
    private Date date;
    private List<String> resources;

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }
}
