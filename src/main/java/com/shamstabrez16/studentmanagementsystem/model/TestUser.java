package com.shamstabrez16.studentmanagementsystem.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@JsonSerialize
@JsonDeserialize
public class TestUser {
    @JsonProperty("name")
    private String name;
    @JsonProperty("dept")
    private String dept;

}
