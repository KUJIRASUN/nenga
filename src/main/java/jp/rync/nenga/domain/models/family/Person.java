package jp.rync.nenga.domain.models.family;

/**
 * 人物
 */
public class Person {

    private final Family family;

    private final FamilyMember familyMember;

    /**
     * コンストラクタ
     * @param family ファミリー
     * @param familyMember ファミリーメンバー
     */
    public Person(Family family, FamilyMember familyMember) {
        this.family = family;
        this.familyMember = familyMember;
    }

    /**
     * 名前の取得
     *
     * ファミリから取得できる名字とファミリメンバーから取得できる名前を合わせて返す
     *
     * @return 名前文字列
     */
    public String getName() {
        return String.format("%s %s", this.family.getFamilyName(), this.familyMember.getName());
    }
}
