package com.charter.springboot.daorepository;

import org.springframework.data.repository.CrudRepository;

import com.charter.springboot.model.RelatedTopic;

public interface TopicRepository extends  CrudRepository<RelatedTopic,String> {

}
