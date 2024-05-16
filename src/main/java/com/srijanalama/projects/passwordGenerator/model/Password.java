package com.srijanalama.projects.passwordGenerator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Password {

    private int length;

    private Boolean isUpperCase ;

    private  Boolean isLowerCase;

    private Boolean isNumber;

    private Boolean isSymbol ;
}
