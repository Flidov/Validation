
public class ValidationSystem {
    static <T> Validator  create (T enter){
        if (enter instanceof Integer){
        return new IntegerValidator();}
        if (enter instanceof String){
        return new StringValidator();}
        else throw new RuntimeException("incorrect class ");
    }


    public static <T> void validate(T enter) throws ValidationFailedException {
        create(enter).validateEnter(enter);
     }
}