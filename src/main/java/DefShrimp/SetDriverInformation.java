package DefShrimp;

import com.google.gson.JsonObject;

public class SetDriverInformation {

    public static void set(String keyTag , JsonObject driverInfo){
        switch (keyTag) {
            case "both_hands_leaving_wheel" -> DriverInformation.bothHandsLeavingWheel = driverInfo.getAsJsonObject("both_hands_leaving_wheel").get("threshold").getAsFloat();
            case "eyes_closed" -> DriverInformation.eyesClosed = driverInfo.getAsJsonObject("eyes_closed").get("threshold").getAsFloat();
            case "no_face_mask" -> DriverInformation.noFaceMask = driverInfo.getAsJsonObject("no_face_mask").get("threshold").getAsFloat();
            case "not_buckling_up" -> DriverInformation.notBucklingUp = driverInfo.getAsJsonObject("not_buckling_up").get("threshold").getAsFloat();
            case "smoke" -> DriverInformation.smoke = driverInfo.getAsJsonObject("smoke").get("threshold").getAsFloat();
            case "not_facing_front" -> DriverInformation.notFacingFront = driverInfo.getAsJsonObject("not_facing_front").get("threshold").getAsFloat();
            case "cellphone" -> DriverInformation.cellphone = driverInfo.getAsJsonObject("cellphone").get("threshold").getAsFloat();
            case "yawning" -> DriverInformation.yawning = driverInfo.getAsJsonObject("yawning").get("threshold").getAsFloat();
            case "head_lowered" -> DriverInformation.headLowered = driverInfo.getAsJsonObject("head_lowered").get("threshold").getAsFloat();
        }
    }
}
