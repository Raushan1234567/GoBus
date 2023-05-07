package com.raush.dao;

import java.util.List;

import bus.dto.Addbus;
import usersignup.dto.UserSignup;

public interface Interface {
  public void Usersignup(UserSignup s);

public void Usersignup(String email, String password);

public void addbus(Addbus bus);



void Updatebus(int id, String busname, String busnumber, String st, String dt, double f, int sa);

public void Delete(int id);

public void Print();
  
}
