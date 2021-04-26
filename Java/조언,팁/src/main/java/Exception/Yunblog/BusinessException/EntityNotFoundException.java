package Exception.Yunblog.BusinessException;

public class EntityNotFoundException extends RuntimeException {
    EntityNotFoundException(String msg) {
        super(msg);
    }
}
