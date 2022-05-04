package zad2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatesRegexUtil {
	
		public List<String> getValidDatesFromText(String text) {
        List<String> validDates = new ArrayList<String>();

        Pattern pattern = Pattern.compile("[1-9]\\d{3}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            validDates.add(matcher.group());
        }

        return validDates;
    }

    public List<String> getTokensFromText(String text) {
        List<String> tokens = new ArrayList<String>();
        StringTokenizer tokenizer = new StringTokenizer(text);
        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }
        return tokens;
    }

}
