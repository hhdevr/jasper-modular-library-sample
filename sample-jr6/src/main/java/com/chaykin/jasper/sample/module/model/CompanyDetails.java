package com.chaykin.jasper.sample.module.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.InputStream;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDetails {

    private String name;

    private String manager;

    private String email;

    private String address;

    private InputStream logo;

}
