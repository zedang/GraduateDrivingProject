package DefShrimp;

public class Main {

    public static void main(String[] args) {
        AccessToken.getAuth();
        var scanResult = new ScanResult(new BaiduAI());
        scanResult.getResult();
        System.out.println(DriverInformation.bothHandsLeavingWheel);
        System.out.println(DriverInformation.eyesClosed);
        System.out.println(DriverInformation.notBucklingUp);
        System.out.println(DriverInformation.smoke);
        System.out.println(DriverInformation.noFaceMask);
    }

}

