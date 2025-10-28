import java.util.*;

public class EmotionDetector {

    // Emotion keywords dictionary
    private static final Map<String, String> emotionMap = new HashMap<>();

    static {
        // Happy-related words
        emotionMap.put("happy", "Happy");
        emotionMap.put("joy", "Happy");
        emotionMap.put("pleased", "Happy");
        emotionMap.put("excited", "Happy");
        emotionMap.put("glad", "Happy");

        // Sad-related words
        emotionMap.put("sad", "Sad");
        emotionMap.put("unhappy", "Sad");
        emotionMap.put("cry", "Sad");
        emotionMap.put("depressed", "Sad");
        emotionMap.put("disappointed", "Sad");

        // Angry-related words
        emotionMap.put("angry", "Angry");
        emotionMap.put("mad", "Angry");
        emotionMap.put("furious", "Angry");
        emotionMap.put("irritated", "Angry");

        // Surprise-related words
        emotionMap.put("surprised", "Surprised");
        emotionMap.put("amazed", "Surprised");
        emotionMap.put("shocked", "Surprised");

        // Fear-related words
        emotionMap.put("afraid", "Fear");
        emotionMap.put("scared", "Fear");
        emotionMap.put("terrified", "Fear");
        emotionMap.put("nervous", "Fear");
    }

    public static String detectEmotion(String text) {
        text = text.toLowerCase();
        int happyCount = 0, sadCount = 0, angryCount = 0, surprisedCount = 0, fearCount = 0;

        for (String word : text.split("\\W+")) {
            String emotion = emotionMap.get(word);
            if (emotion != null) {
                switch (emotion) {
                    case "Happy": happyCount++; break;
                    case "Sad": sadCount++; break;
                    case "Angry": angryCount++; break;
                    case "Surprised": surprisedCount++; break;
                    case "Fear": fearCount++; break;
                }
            }
        }

        Map<String, Integer> counts = new LinkedHashMap<>();
        counts.put("Happy", happyCount);
        counts.put("Sad", sadCount);
        counts.put("Angry", angryCount);
        counts.put("Surprised", surprisedCount);
        counts.put("Fear", fearCount);

        // Find max emotion
        String detectedEmotion = "Neutral";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                detectedEmotion = entry.getKey();
            }
        }

        return detectedEmotion;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to analyze emotion:");
        String input = sc.nextLine();
        sc.close();

        String emotion = detectEmotion(input);
        System.out.println("Detected Emotion: " + emotion);
    }
}
