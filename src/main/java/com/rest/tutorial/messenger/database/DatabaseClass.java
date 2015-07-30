package com.rest.tutorial.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.rest.tutorial.messenger.model.Comment;
import com.rest.tutorial.messenger.model.Message;
import com.rest.tutorial.messenger.model.Profile;

//not thread safe !
public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	private static Map<String, Profile> profiles = new HashMap<String, Profile>();
	private static Map<Long, Comment> comments = new HashMap<Long, Comment>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	
	public static Map<Long, Comment> getComments() {
		return comments;
	}

}
