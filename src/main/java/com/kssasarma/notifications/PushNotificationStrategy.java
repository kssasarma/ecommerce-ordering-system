package com.kssasarma.notifications;

public class PushNotificationStrategy implements NotificationStrategy {

	@Override
	public void notifyUser(String name, String message) {
		System.out.println("Sending push notification with message: " + message + " to user: " + name);
	}
}
