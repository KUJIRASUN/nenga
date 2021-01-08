package jp.rync.nenga.domain.models.family;

import jp.rync.nenga.base.domain.models.Entity;
import jp.rync.nenga.domain.models.master.Prefecture;

/**
 * ファミリ
 */
public class Family extends Entity<FamilyId> {
    // 郵便番号
    private final String postalCode;
    // 都道府県
    private final Prefecture prefecture;
    // 市区町村
    private final String city;
    // その他 住所情報
    private final String address;
    // 建物名
    private final String building;
    // 苗字
    private final String familyName;

    /**
     * コンストラクタ
     * @param postalCode 郵便番号
     * @param prefecture 都道府県
     * @param city 市区町村
     * @param address その他 住所情報
     * @param building 建物名
     * @param familyName 苗字
     */
    public Family(
            final FamilyId id,
            final String postalCode,
            final Prefecture prefecture,
            final String city,
            final String address,
            final String building,
            final String familyName
    ) {
        super(id);
        this.postalCode = postalCode;
        this.prefecture = prefecture;
        this.city       = city;
        this.address    = address;
        this.building   = building;
        this.familyName = familyName;
    }

    /**
     * 郵便番号の取得
     * @return 郵便番号
     */
    public String getPostalCode() { return this.postalCode; }

    /**
     * 都道府県の取得
     * @return 都道府県
     */
    public Prefecture getPrefecture() { return this.prefecture; }

    /**
     * 市区町村の取得
     * @return 市区町村
     */
    public String getCity() { return this.city; }

    /**
     * その他 住所の取得
     * @return その他 住所
     */
    public String getAddress() { return this.address; }

    /**
     * 建物名の取得
     * @return 建物名
     */
    public String getBuilding() { return this.building; }

    /**
     * 名字の取得
     * @return 名字
     */
    public String getFamilyName() { return this.familyName; }

}
