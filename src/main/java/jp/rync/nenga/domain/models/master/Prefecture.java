package jp.rync.nenga.domain.models.master;

/**
 * 都道府県
 */
public class Prefecture {

    /**
     * 都道府県コード
     */
    private PrefectureCode code;

    /**
     * 都道府県名
     */
    private String name;

    /**
     * コンストラクタ
     * @param code 都道府県コード
     * @param name 都道府県名
     */
    public Prefecture(final PrefectureCode code, final String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 都道府県コードの取得
     * @return 都道府県コード
     */
    public PrefectureCode getCode() { return this.code; }

    /**
     * 都道府県名の取得
     * @return 都道府県名
     */
    public String getName() { return this.name; }
}
