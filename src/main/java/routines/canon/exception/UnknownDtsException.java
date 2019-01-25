package routines.canon.exception;

public class UnknownDtsException extends PtsOtherException {
    public UnknownDtsException(String dtsId) {
        super(String.format("Отсутствует настройка мапинга для вида сведений: %s ", dtsId));
    }
}
