package jp.rync.nenga.domain.models.family;

import jp.rync.nenga.base.domain.models.Entity;

/**
 * ファミリーメンバー
 */
public class FamilyMember extends Entity<FamilyMemberId> {
    /**
     * 名前
     */
    private final String name;

    /**
     * コンストラクタ
     * @param id ID
     * @param name 名前
     */
    public FamilyMember(FamilyMemberId id, String name) {
        super(id);
        this.name = name;
    }


    public String getName() { return this.name; }
}
