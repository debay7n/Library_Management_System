package com.bookStore.service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {
   @Autowired
    public MyBookRepository mybook;

    public void saveMyBook(MyBookList book){
        mybook.save(book);

    }

    public List<MyBookList> getAllMyBooks(){
        return mybook.findAll();
    }

    public void deleteByID(int id){
        mybook.deleteById(id);
    }
}
