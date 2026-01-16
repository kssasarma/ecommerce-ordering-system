package com.kssasarma;

import com.kssasarma.notifications.EmailNotificationStrategy;
import com.kssasarma.notifications.NotificationStrategy;

public class User {

	private String name = "randomUser" + System.currentTimeMillis();
	private String email = name + "@example.com";
	private String deviceToken = "deviceToken_" + name;
	private NotificationStrategy notificationStrategy;

	public void update(String message) {
		notificationStrategy.notifyUser(name, email, deviceToken, message);
	}

	public User(NotificationStrategy notificationStrategy) {
		this.notificationStrategy = notificationStrategy;
	}

	public User() {
		this.notificationStrategy = new EmailNotificationStrategy();
	}

}
