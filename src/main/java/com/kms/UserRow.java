package com.kms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRow{
    private int ID;
    private String Email;
    private String FirstName;
    private String LastName;
}

