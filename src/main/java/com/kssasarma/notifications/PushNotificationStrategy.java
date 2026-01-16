package com.kssasarma.notifications;

public class PushNotificationStrategy implements NotificationStrategy {

	@Override
	public void notifyUser(String name, String email, String deviceId, String message) {
		System.out.println(
				"Sending PUSH notification to " + name + " on device " + deviceId + " with message: " + message);
	}
}
