package com.example.journalApp.repository;
import com.example.journalApp.enity.ConfigJournalAppEntity;
import com.example.journalApp.enity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {

}
