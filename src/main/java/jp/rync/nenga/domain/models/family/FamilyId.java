package jp.rync.nenga.domain.models.family;

import jp.rync.nenga.base.domain.models.Identifier;

/**
 * ファミリID
 */
public class FamilyId extends Identifier<Long> {

    /**
     * コンストラクタ
     * @param value 識別子の値
     */
    public FamilyId(final Long value) {
        super(value);
    }
}
