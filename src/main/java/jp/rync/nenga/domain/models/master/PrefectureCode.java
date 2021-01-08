package jp.rync.nenga.domain.models.master;

/**
 * 都道府県コード
 */
public class PrefectureCode {
    /**
     * 都道府県コード値
     */
    private Integer value;

    /**
     * コンストラクタ　
     * @param value 都道府県コード値
     */
    public PrefectureCode(final Integer value) {
        this.value = value;
    }

    /**
     * 都道府県コード値の取得
     * @return 都道府県コード値
     */
    public Integer getValue() { return this.value; }

}
