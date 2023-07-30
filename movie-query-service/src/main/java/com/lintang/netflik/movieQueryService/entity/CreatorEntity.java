package com.lintang.netflik.movieQueryService.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CreatorEntity {

    @Id
    private int id;

    @NotNull(message = "Creator name is required")
    private String name;

    public CreatorEntity( String name) {

        this.name = name;
    }



//    @JsonIgnore
////    @DBRef
//    private Set<MovieEntity> movies = new HashSet<MovieEntity>();


    public int getId() {
        return id;
    }

    public CreatorEntity setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreatorEntity setName(String name) {
        this.name = name;
        return this;
    }

//    public Set<MovieEntity> getMovies() {
//        return movies;
//    }
//
//    public CreatorEntity setMovies(Set<MovieEntity> movies) {
//        this.movies = movies;
//        return this;
//    }
//
//    public void addMovie(MovieEntity movie) {
//        this.movies.add(movie);
//    }
//
//    public void removeMovie(MovieEntity movie) {
//        this.movies.remove(movie);
//    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
}
