package jp.rync.nenga.base.domain.models;

/**
 * 識別子不在例外
 */
public class IdNotFoundException extends Exception {
    /**
     * コンストラクタ
     * @param message 例外メッセージ
     * @param throwable Throwable
     */
    public IdNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

    /**
     * コンストラクタ
     * @param message 例外メッセージ
     */
    public IdNotFoundException(String message) {
        this(message, null);
    }
}
