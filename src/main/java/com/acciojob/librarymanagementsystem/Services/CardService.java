package com.acciojob.librarymanagementsystem.Services;

import com.acciojob.librarymanagementsystem.Entities.LibraryCard;
import com.acciojob.librarymanagementsystem.Entities.Students;
import com.acciojob.librarymanagementsystem.Enums.cardStatus;
import com.acciojob.librarymanagementsystem.Repository.CardRepository;
import com.acciojob.librarymanagementsystem.Repository.StudentRepository;
import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private StudentRepository studentRepository;

    public String getFreshCard(){
        LibraryCard newCard = new LibraryCard();
        newCard.setCardStatus(cardStatus.NEW);
        newCard.setNoOfBooksIssued(0);
        LibraryCard savedCard = cardRepository.save(newCard);
        return "New Card with Card No "+savedCard.getCardId()+" has been generated";
    }

    public String associateCardAndStudent(Integer studentId,Integer cardId) throws Exception{
        Optional<LibraryCard> optionalLibraryCard = cardRepository.findById(cardId);

        if(optionalLibraryCard.isEmpty()){
            throw new Exception("Invalid card Id Entered");
        }

        LibraryCard libraryCard = optionalLibraryCard.get();

        Optional<Students> optionalStudent = studentRepository.findById(studentId);

        if(optionalStudent.isEmpty()){
            throw new Exception("No student with the given Id exists int the system");
        }

        Students student = optionalStudent.get();
        libraryCard.setCardStatus(cardStatus.ACTIVE);
        libraryCard.setStudent(student);
        libraryCard.setNoOfBooksIssued(0);

        cardRepository.save(libraryCard);
    }
}
