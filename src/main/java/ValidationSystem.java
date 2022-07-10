


public class ValidationSystem<T> {
    protected T enter;

    private ValidationSystem(T enter) {
        this.enter = enter;
    }

    public static <T> void validate(T enter) throws ValidationFailedException {

        if (enter instanceof Integer) {
            Validator <Integer> a = new  IntegerValidator();
            a.validateEnter((Integer) enter);
        }
        if (enter instanceof String) {
            Validator<String> a = new StringValidator();
            a.validateEnter((String) enter);
        }
    }


}