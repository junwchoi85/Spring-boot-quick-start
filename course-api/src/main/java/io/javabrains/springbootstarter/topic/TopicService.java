package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "spring framework", "spring framework description"),
			new Topic("java", "core java", "core java description"),
			new Topic("javascript", "javascript", "javascript description")
			);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
}
