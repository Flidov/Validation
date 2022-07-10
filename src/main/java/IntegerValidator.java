public  class IntegerValidator <T>implements Validator<T> {

    public static Integer validate(Integer enter) throws ValidationFailedException {
        if (enter > 0 && enter < 11) {
            return enter;
        } else throw new ValidationFailedException("неверный интервал");
    }

    @Override
    public  void validateEnter(T enter) throws ValidationFailedException {
            validate((Integer) enter);
    }


}

