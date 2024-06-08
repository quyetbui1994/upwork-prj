package com.example.upwork.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Comment {
    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private Date createdAt;

    @JsonProperty("created_by")
    private CreatedBy createdBy;

    @JsonProperty("is_reply_comment")
    private boolean isReplyComment;

    @JsonProperty("item")
    private Item item;

    @JsonProperty("message")
    private String message;

    @JsonProperty("modified_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private Date modifiedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class CreatedBy {
        @JsonProperty("id")
        private String id;
        @JsonProperty("type")
        private String type;
        @JsonProperty("login")
        private String login;
        @JsonProperty("name")
        private String name;

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Item {
        @JsonProperty("id")
        private String id;
        @JsonProperty("type")
        private String type;

    }

}
