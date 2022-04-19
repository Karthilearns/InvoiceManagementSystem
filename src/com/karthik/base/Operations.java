package com.karthik.base;

import java.util.ArrayList;
import java.util.List;

public class Operations
{
    List<Product> products = new ArrayList<>();
    List<Invoice> invoices = new ArrayList<>();
    List<User> users = new ArrayList<>();

    public void addUser(User user)
    {
        users.add(user);
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public void addInvoice(Invoice invoice)
    {
        invoices.add(invoice);
    }

    public List<Product> getAllProducts()
    {
        return products;
    }

    public User getUserByUserId(int userid)
    {
        for(User u:users)
        {
            if(u.getUserID()==userid)
            {
                return  u;
            }
        }
        return null;
    }

    public List<Invoice> getAllInvoices(User user)
    {
        return  user.getAllInvoices();
    }
    public List<Invoice> getAllInvoices()
    {
        return invoices;
    }

    public List<User> getUsers()
    {
        return users;
    }
}
