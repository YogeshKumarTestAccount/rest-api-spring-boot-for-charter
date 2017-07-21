package com.charter.springboot.serviceimpl;

import com.charter.springboot.daorepository.TopicRepository;
import com.charter.springboot.model.*;
import com.charter.springboot.service.TopicService;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {

	/*
	 * private List<RelatedTopic> topics = new ArrayList<>( Arrays.asList(new
	 * RelatedTopic("Java", "Spring", "Friend Funct1.2.3"), new
	 * RelatedTopic("C++", "FriendFunction", "Spring 4.3.2"), new
	 * RelatedTopic("C", "Pointer", "Pointer 4.3.2")));
	 */

	@Autowired
	TopicRepository topicRepogitory;

	public TopicServiceImpl() {
	};

	@Override
	public List<RelatedTopic> getAllTopics() {
		List<RelatedTopic> topics = new ArrayList<>();
		topicRepogitory.findAll().forEach(topics::add);
		return topics;
	}

	public RelatedTopic getTopicById(String id) {
		// return topics.stream().filter(t ->
		// t.getId().equals(id)).findFirst().get();
		return topicRepogitory.findOne(id);
	}

	@Override
	public void addTopic(RelatedTopic topic) {
		// topics.add(topic);

		topicRepogitory.save(topic);

	}

	@Override
	public void updateTopic(RelatedTopic topic, String id) {

		topicRepogitory.save(topic);

		/*
		 * for (int index = 0; index < topics.size(); index++) { RelatedTopic t
		 * = topics.get(index);
		 * 
		 * if (t.getId().equals(id)) { topics.set(index, topic); }
		 * 
		 * }
		 */

	}

	@Override
	public void deleteTopic(String id) {

		// topics.removeIf(t -> t.getId().equals(id));

		topicRepogitory.delete(id);
	}

}
