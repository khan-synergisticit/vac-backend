package com.synergisticit.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import lombok.*;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
//@Document("userDetails")
@DynamoDBTable(tableName = "userDetails")
public class UserDetails {


    //@Id
    @DynamoDBHashKey
    private String userId;
    private String firstName;
    private String lastName;
    private String occupation;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private String gender;
    private String phone;
    private String email;


    @DynamoDBHashKey(attributeName = "userID")
    public String getUserID() {
        return userId;
    }

    public void setUserID(String userID) {
        this.userId = userID;
    }
    @DynamoDBAttribute(attributeName = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @DynamoDBAttribute(attributeName = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @DynamoDBAttribute(attributeName = "occupation")
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    @DynamoDBAttribute(attributeName = "address1")
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    @DynamoDBAttribute(attributeName = "address2")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    @DynamoDBAttribute(attributeName = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @DynamoDBAttribute(attributeName = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @DynamoDBAttribute(attributeName = "zipcode")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    @DynamoDBAttribute(attributeName = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @DynamoDBAttribute(attributeName = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @DynamoDBAttribute(attributeName = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

