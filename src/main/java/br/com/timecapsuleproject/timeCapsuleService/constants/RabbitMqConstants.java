package br.com.timecapsuleproject.timeCapsuleService.constants;

public class RabbitMqConstants {

    public static final String EXCHANGE = "notification.exchange";

    public static final String QUEUE_NEW_MESSAGE = "notification.new_message";
    public static final String QUEUE_CAPSULE_CREATION = "notification.capsule_creation";
    public static final String QUEUE_USER_INVITATION = "notification.user_invitation";
    public static final String QUEUE_USER_TURN_ADMIN = "notification.user_turn_admin";
    public static final String QUEUE_USER_LEAVE = "notification.user_leave_time_capsule";
    public static final String QUEUE_CAPSULE_OPENED = "notification.capsule_opened";

    public static final String ROUTING_KEY_NEW_MESSAGE = "notification.new_message";
    public static final String ROUTING_KEY_CAPSULE_CREATION = "notification.capsule_creation";
    public static final String ROUTING_KEY_USER_INVITATION = "notification.user_invitation";
    public static final String ROUTING_KEY_USER_TURN_ADMIN = "notification.user_turn_admin";
    public static final String ROUTING_KEY_USER_LEAVE = "notification.user_leave_time_capsule";
    public static final String ROUTING_KEY_CAPSULE_OPENED = "notification.capsule_opened";

}
