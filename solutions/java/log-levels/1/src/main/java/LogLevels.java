public class LogLevels {
    
    public static String message(String logLine) {
        // Extract the message after the log level brackets
        // Format: "[LEVEL]: message"
        int colonIndex = logLine.indexOf(": ");
        return logLine.substring(colonIndex + 2).trim();
    }

    public static String logLevel(String logLine) {
        // Extract the log level between the brackets
        // Format: "[LEVEL]: message"
        int openBracket = logLine.indexOf("[");
        int closeBracket = logLine.indexOf("]");
        return logLine.substring(openBracket + 1, closeBracket).toLowerCase();
    }

    public static String reformat(String logLine) {
        // Reformat to: "message (level)"
        String message = message(logLine);
        String level = logLevel(logLine);
        return message + " (" + level + ")";
    }
}