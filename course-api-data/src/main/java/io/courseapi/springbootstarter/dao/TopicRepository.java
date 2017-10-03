package io.courseapi.springbootstarter.dao;

import org.springframework.data.repository.CrudRepository;

import io.courseapi.springbootstarter.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
