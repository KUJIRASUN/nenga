package jp.rync.nenga.base.domain.models;

/**
 * 識別子
 * @param <T> 識別子の値の型
 */
public class Identifier<T> {
    /**
     * 識別子の値
     */
    private final T value;

    /**
     * コンストラクタ
     * @param value 識別子の値
     */
    public Identifier(final T value) { this.value = value; }

    /**
     * 識別子の値の取得
     * @return 識別子
     */
    public T getValue() { return this.value; }
}
