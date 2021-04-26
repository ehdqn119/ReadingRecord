package Exception.Yunblog.BusinessException;



public class CouponUsedException extends RuntimeException {
    CouponUsedException(String msg) {
        super(msg);
    }
}
