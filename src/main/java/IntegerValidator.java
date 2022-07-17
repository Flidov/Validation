public  class IntegerValidator implements Validator<Integer> {

    public static Integer validate(Integer enter) throws ValidationFailedException {
        if (enter > 0 && enter < 11) {
            return enter;
        } else throw new ValidationFailedException("неверный интервал");
    }

    @Override
    public  void validateEnter(Integer enter) throws ValidationFailedException {
            validate( enter);
    }


}

