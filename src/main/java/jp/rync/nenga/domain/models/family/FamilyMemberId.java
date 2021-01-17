package jp.rync.nenga.domain.models.family;

import jp.rync.nenga.base.domain.models.Identifier;

/**
 * ファミリメンバーID
 */
public class FamilyMemberId extends Identifier<Long> {
    /**
     * コンストラクタ
     * @param value ID
     */
    public FamilyMemberId(Long value) {
        super(value);
    }
}
