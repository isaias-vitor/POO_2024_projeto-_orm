/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crud;

import java.time.LocalDate;

/**
 *
 * @author isaias-vitor
 */
public class Crud {

    public static void main(String[] args) {
        
        UserDao userDao = new UserDao();

        userDao.saveOrUpdate(new User(1L, "Ana Zaira", "a.zaira@mail.com", "123", LocalDate.now(), true));
        userDao.saveOrUpdate(new User(2L, "Beatriz Yana", "b.yana@mail.com", "456", LocalDate.now(), true));
        
    }
}
