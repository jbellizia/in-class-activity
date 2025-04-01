import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// This code has to do with time.
    
public class datetime_convert {
    public static void main(String[] args) {
        String dateStr = "2022-03-17 10:45:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateObj = LocalDateTime.parse(dateStr, formatter);
        String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));

        System.out.println(formattedDate);
    }
}

// Description A clear and concise description of what the issue/bug is.

// Steps to Reproduce
//Useless function included
// First step to reproduce the issue/bug
// Second step to reproduce the issue/bug
// Third step to reproduce the issue/bug
// Expected Behavior A clear and concise description of what you expected to happen.

// Actual Behavior A clear and concise description of what actually happened.

// Screenshots If applicable, add screenshots to help explain the issue/bug.

// Additional Information

// Operating System:
// Browser:
// Version:
// Any other relevant information
// Possible Solution If you have any suggestions for a possible solution, please include them here.

// Related Issues Are there any related issues? If so, please link to them here.

// Priority How critical is this issue/bug? Low, medium, or high priority?

// Reproducibility How often can this issue/bug be reproduced? Always, sometimes, or random?

// Impact What is the impact of this issue/bug? Low, medium, or high?
