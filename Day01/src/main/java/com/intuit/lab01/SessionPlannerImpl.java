package com.intuit.lab01;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SessionPlannerImpl implements SessionPlanner{
	private Properties topics;
	private List<String> _60MinTopics;
	private List<String> _50MinTopics;
	private List<String> _45MinTopics;
	
	public SessionPlannerImpl(Properties topics) {
		this.topics = topics;
		_60MinTopics = new ArrayList<>();
		_50MinTopics = new ArrayList<>();
		_45MinTopics = new ArrayList<>();
		sortAllTopicsByDuration();
	}
	
	private void sortAllTopicsByDuration() {
		//Lambda Expressions
		topics.forEach((topic,duration) -> {
			if(duration.toString().contains("60")) {
				_60MinTopics.add(topic.toString());
			}
			else if(duration.toString().contains("45")) {
				_45MinTopics.add(topic.toString());
			}
			else if(duration.toString().contains("50")) {
				_50MinTopics.add(topic.toString());
			}
		});
	}

	public int get60MinTopicsCount() {
		return _60MinTopics.size();
	}

	public int get50MinTopicsCount() {
		return _50MinTopics.size();
	}

	public int get45MinTopicsCount() {
		return _45MinTopics.size();
	}


	
}
