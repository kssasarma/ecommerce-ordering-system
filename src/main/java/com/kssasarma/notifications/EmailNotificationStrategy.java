package com.kssasarma.notifications;

public class EmailNotificationStrategy implements NotificationStrategy {

	@Override
	public void notifyUser(String name, String message) {
		System.out.println("Sending email notification with message: " + message + " to user: " + name);
	}

}
