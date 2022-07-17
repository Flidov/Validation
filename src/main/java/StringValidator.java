import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator  implements Validator<String>{
    public static String validate (String enter) throws ValidationFailedException {
        Pattern pattern = Pattern.compile("^[A-Z]");
        Matcher matcher = pattern.matcher(enter);
        if (matcher.find())
            return enter;
        else throw new ValidationFailedException("начинаеться с маленькой буквы");
    }

    @Override
    public  void validateEnter(String enter) throws ValidationFailedException {
        validate( enter);
    }
}

