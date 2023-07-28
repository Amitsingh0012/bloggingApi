package com.Blogging.plateform.blogging.plateform.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSignUp {
    private boolean signUpStatus;
    private String signUpStatusMessage;
}
