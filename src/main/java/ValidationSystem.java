import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ValidationSystem <T>{
    protected T enter;

    private ValidationSystem(T enter) {
        this.enter = enter;
    }

    public static <T > void validate(T enter) throws ValidationFailedException{
      if(enter.getClass()==Integer.class){
        validateInt((Integer) enter);
      }
      if (enter.getClass()==String.class)
          validateString((String) enter);
    }

    public static int validateInt(int enter) throws ValidationFailedException {
        if (enter>0&&enter<11){
            return enter;
        }
        else throw new ValidationFailedException("не верный интервал");
    }
    public static String   validateString (String enter) throws ValidationFailedException {
        Pattern pattern = Pattern.compile("^[A-Z]");
        Matcher matcher = pattern.matcher(enter);
        if (matcher.find())
        return enter;
     else throw new ValidationFailedException("начинаеться с маленькой буквы");
    }
}
