package jp.rync.nenga.base.domain.models;

/**
 * 識別子
 * @param <T> 識別子の値の型
 */
public class Identifier<T> {
    /**
     * 識別子の値
     */
    private T value;

    /**
     * コンストラクタ
     * @param value 識別子の値
     */
    public Identifier(T value) {
        this.value = value;
    }

    /**
     * 識別子の値の取得
     * @return
     */
    public T getValue() {
        return this.value;
    }
}
