package jp.rync.nenga.base.model;

import java.util.Optional;

/**
 * エンティティ
 * @param <ID> 識別子
 */
public class Entity<ID extends Identifier<?>> {
    /**
     * 識別子（Optional）
     */
    private Optional<ID> idOptional;

    /**
     * コンストラクタ
     * @param idOptional 識別子（Optional）
     */
    public Entity(Optional<ID> idOptional) {
        this.idOptional = idOptional;
    }

    /**
     * 識別子の取得
     * @return 識別子
     * @throws IdNotFoundException 識別子不在例外
     */
    public ID getId() throws IdNotFoundException {
        if(this.idOptional.isPresent()) {
            return this.idOptional.get();
        } else {
            throw new IdNotFoundException("ID not found.");
        }
    }

}
