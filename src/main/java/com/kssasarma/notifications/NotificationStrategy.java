package com.kssasarma.notifications;

public interface NotificationStrategy {
	public void notifyUser(String name, String email, String deviceId, String message);
}
