package com.acciojob.librarymanagementsystem.Services;

import com.acciojob.librarymanagementsystem.Entities.LibraryCard;
import com.acciojob.librarymanagementsystem.Enums.cardStatus;
import com.acciojob.librarymanagementsystem.Repository.CardRepository;
import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public String getFreshCard(){
        LibraryCard newCard = new LibraryCard();
        newCard.setCardStatus(cardStatus.NEW);
        newCard.setNoOfBooksIssued(0);
        LibraryCard savedCard = cardRepository.save(newCard);
        return "New Card with Card No "+savedCard.getCardId()+" has been generated";
    }
}
