package com.synergisticit.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
@DynamoDBTable(tableName = "userDetails")
public class UserDetails {

    @DynamoDBHashKey
    private String userID;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    private String occupation;
    private Map<String, String> address;
    @NotEmpty
    private String gender;
    private String[] medicalHistory;

}

//UserDetails: {
//        userID:"",
//        firstName:"",
//        lastName:"",
//        occupation:"",
//        address: {address1:"",
//        address2:"",
//        city:"",
//        state:"",
//        zipcode:""},
//        gender:"",
//        medicalHistory:[]
//        }