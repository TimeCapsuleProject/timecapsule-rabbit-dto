package br.com.timecapsuleproject.timeCapsuleService.constants;

public class RabbitMqConstants {

    public static final String EXCHANGE = "timecapsule.exchange";

    public static final String QUEUE_USER_INVITATION = "timecapsule.user_invitation";
    public static final String QUEUE_USER_TURN_ADMIN = "timecapsule.user_turn_admin";
    public static final String QUEUE_USER_LEAVE_TRIGGER = "timecapsule.user_leave.trigger";
    public static final String QUEUE_USER_LEAVE_NOTIFICATION = "timecapsule.user_leave.notification";
    public static final String QUEUE_CAPSULE_OPENED = "timecapsule.capsule_opened";
    public static final String QUEUE_CAPSULE_CREATION_TRIGGER = "timecapsule.capsule_creation.trigger";
    public static final String QUEUE_CAPSULE_CREATION_NOTIFICATION = "timecapsule.capsule_creation.notification";
    public static final String QUEUE_NEW_MESSAGE_TRIGGER = "timecapsule.new_message.trigger";
    public static final String QUEUE_NEW_MESSAGE_NOTIFICATION = "timecapsule.new_message.notification";

    public static final String ROUTING_KEY_NEW_MESSAGE = "timecapsule.new_message";
    public static final String ROUTING_KEY_CAPSULE_CREATION = "timecapsule.capsule_creation";
    public static final String ROUTING_KEY_USER_INVITATION = "timecapsule.user_invitation";
    public static final String ROUTING_KEY_USER_TURN_ADMIN = "timecapsule.user_turn_admin";
    public static final String ROUTING_KEY_USER_LEAVE = "timecapsule.user_leave_time_capsule";
    public static final String ROUTING_KEY_CAPSULE_OPENED = "timecapsule.capsule_opened";

}
