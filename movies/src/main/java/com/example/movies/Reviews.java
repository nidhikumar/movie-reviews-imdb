package com.example.movies;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {
	@Id
	private ObjectId id;
	private String body;
	private LocalDateTime created;
    private LocalDateTime updated;

    public Reviews(String body, LocalDateTime created, LocalDateTime updated) {
        this.body = body;
        this.created = created;
        this.updated = updated;
    }

	public Reviews(ObjectId id, String body, LocalDateTime created, LocalDateTime updated) {
		super();
		this.id = id;
		this.body = body;
		this.created = created;
		this.updated = updated;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Reviews [id=" + id + ", body=" + body + ", created=" + created + ", updated=" + updated + "]";
	}

	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}
	
	public Reviews(String reviewBody) {
        this.body = reviewBody;
        this.created = LocalDateTime.now();
        this.updated = LocalDateTime.now();
    }
}
