package DefShrimp;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Map;
import java.util.Objects;

public class ScanResult {
    private final CanDriverScan driverScan;

    public ScanResult(CanDriverScan driverScan) {
        this.driverScan = driverScan;
    }

    public void getResult(){
        JsonObject driverObject = (JsonObject) JsonParser.parseString(Objects.requireNonNull(driverScan.driverBehavior()));

        JsonObject driverInfo = driverObject.getAsJsonArray("person_info").get(0).getAsJsonObject().getAsJsonObject("attributes");

        for (Map.Entry<String , JsonElement> entry : driverInfo.entrySet())
            SetDriverInformation.set(entry.getKey() , driverInfo);

    }

}