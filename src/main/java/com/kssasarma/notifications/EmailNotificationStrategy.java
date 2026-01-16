package com.kssasarma.notifications;

public class EmailNotificationStrategy implements NotificationStrategy {

	@Override
	public void notifyUser(String name, String email, String deviceId, String message) {
		System.out.println("Sending EMAIL to " + name + " at " + email + " with message: " + message);
	}

}
