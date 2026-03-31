package lambda_expression;
@FunctionalInterface
interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {

        LightAction motionDetected = () ->
                System.out.println("Lights ON at full brightness");

        LightAction nightTime = () ->
                System.out.println("Lights set to warm dim mode");

        LightAction voiceCommand = () ->
                System.out.println("Lights turned ON via voice command");

        // Trigger actions
        motionDetected.execute();
        nightTime.execute();
        voiceCommand.execute();
    }
}
