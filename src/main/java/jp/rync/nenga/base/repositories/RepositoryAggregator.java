package jp.rync.nenga.base.repositories;

import jp.rync.nenga.base.domain.models.Entity;
import jp.rync.nenga.base.domain.models.Identifier;
import jp.rync.nenga.base.domain.models.SearchCondition;
import jp.rync.nenga.base.domain.models.SearchResult;

/**
 * リポジトリの集約用インターフェース
 * <p>
 * 各データストレージにアクセスするリポジトリを集約してドメインサービスやドメインモデルからストレージを意識せずに呼び出すためのインターフェース
 * <p>
 * このインターフェースを継承したクラスをドメインサービスやドメインモデルは呼び出してデータをのCRUDを行う
 */
public interface RepositoryAggregator<ID extends Identifier<?>, ENTITY extends Entity<ID>, CONDITION extends SearchCondition, RESULT extends SearchResult<CONDITION, ENTITY>> {

    /**
     * 作成・更新
     *
     * @param entity Entityを継承したクラス
     * @param ctr    EntityIOContextContainer
     * @return Entity
     */
    public ENTITY save(ENTITY entity, EntityIOContextContainer ctr);

    /**
     * 削除
     *
     * @param id  ID
     * @param ctr EntityIOContextContainer
     * @return ID
     */
    public ID delete(ID id, EntityIOContextContainer ctr);

    /**
     * IDでエンティティを検索
     *
     * @param id  ID
     * @param ctr EntityIOContextContainer
     * @return Entity
     */
    public ENTITY findById(ID id, EntityIOContextContainer ctr);

    /**
     * エンティティをすべて取得
     *
     * @param condition 検索条件
     * @param ctr       EntityIOContextContainer
     * @return 検索結果
     */
    public RESULT findAll(CONDITION condition, EntityIOContextContainer ctr);
}
