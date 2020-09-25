/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vip.dialer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jefferson@jpbx.com.br < https://jpbx.com.br >
 */
public class ContactCenter implements Serializable{
    private static List<Contact> contacts;

    public List<Contact> getContacts() {
        if(contacts==null)
            contacts=new ArrayList<>();
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        ContactCenter.contacts = contacts;
    }
    
    
}
