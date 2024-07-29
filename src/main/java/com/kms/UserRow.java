package com.kms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.annotations.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRow{

    @Column("ID")
    @NotNull
    private int ID;

    @Column("Email")
    @NotNull
    private String email;

    @Column("FirstName")
    private String firstName;

    @Column("LastName")
    private String lastName;
}

