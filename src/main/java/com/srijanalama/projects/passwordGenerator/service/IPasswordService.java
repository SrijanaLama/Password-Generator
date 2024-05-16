package com.srijanalama.projects.passwordGenerator.service;

import com.srijanalama.projects.passwordGenerator.model.Password;

public interface IPasswordService {

    String generatePassword(Password password);
}
