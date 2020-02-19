package fr.ugesellsloaning.api.services;

import fr.ugesellsloaning.api.entities.Account;
import fr.ugesellsloaning.api.entities.User;
import fr.ugesellsloaning.api.repositories.IAccountRepository;
import fr.ugesellsloaning.api.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServices {
    @Autowired
    private IAccountRepository accountRepostory;

    public void save(Account account){
        accountRepostory.save(account);
    }

    public Iterable<Account> listAccount(){
        return accountRepostory.findAll();
    }

    public Optional<Account> getAccountById(long id){
        return accountRepostory.findById(id);
    }

    public void delete(Account account){
        accountRepostory.delete(account);
    }

    public void deleteById(Long id){
        accountRepostory.deleteById(id);
    }






}