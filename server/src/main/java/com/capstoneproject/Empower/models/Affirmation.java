package com.capstoneproject.Empower.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "affirmations")
public class Affirmation implements Serializable {

    @Column(name = "Title", columnDefinition="text")
    private String title;

    @Column(name = "rating")
    private int rating;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties({"affirmations"})
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @JsonIgnoreProperties({"affirmations"})
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "affirmations_forums",
            joinColumns = {@JoinColumn(name = "affirmation_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "forum_id", nullable = false, updatable = false)}
    )
    private List<Forum> forums;

    public Affirmation(String title, int rating, Category category) {
        this.title = title;
        this.rating = rating;
        this.category = category;
        this.forums = new ArrayList<Forum>();
    }

    public Affirmation(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Forum> getForums() {
        return forums;
    }

    public void setForums(List<Forum> forums) {
        this.forums = forums;
    }

    public void addForum(Forum forum){
        this.forums.add(forum);
    }

}
