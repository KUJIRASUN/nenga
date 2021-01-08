package jp.rync.nenga.base.domain.models;

import java.util.Optional;

/**
 * エンティティ
 * @param <ID> 識別子
 */
public class Entity<ID extends Identifier<?>> {
    /**
     * 識別子（Optional）
     */
    private final ID id;

    /**
     * コンストラクタ
     * @param id 識別子（Optional）
     */
    public Entity(ID id) {
        this.id = id;
    }

    /**
     * 識別子の取得
     * @return 識別子
     * @throws IdNotFoundException 識別子不在例外
     */
    public ID getId() throws IdNotFoundException {
        Optional<ID> idOptional = Optional.ofNullable(this.id);
        if(idOptional.isPresent()) {
            return idOptional.get();
        } else {
            throw new IdNotFoundException("ID not found.");
        }
    }

}
