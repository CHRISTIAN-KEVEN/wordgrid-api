/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keven.wordgridapi.controllers;

import com.keven.wordgridapi.services.WordGridService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author CHRISTIAN
 */
@RestController
public class WordGridController {
    
    @Autowired
    WordGridService wordgridService;
    
    @RequestMapping(value="/wordgrid", method = RequestMethod.GET)
    public String getWordGrid() {
        
        List<String> words = new ArrayList<>();
        return wordgridService.generateGrid(Arrays.asList("ONE", "TWO", "THREE", "FOUR", "FIVE"));
        
    }
}
