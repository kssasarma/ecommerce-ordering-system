package com.kssasarma;

import com.kssasarma.notifications.NotificationStrategy;

public class User {

	private String name = "randomUser" + System.currentTimeMillis();
	private String email = name + "@example.com";
	private NotificationStrategy notificationStrategy;

	public void update(String message) {
		notificationStrategy.notifyUser(name, message);
	}

}
