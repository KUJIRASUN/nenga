package jp.rync.nenga.base.domain.models;

import java.util.List;

public interface SearchResult<CONDITION extends SearchCondition, ENTITY extends Entity<?>> {
    /**
     * 結果の一覧取得
     * @return Limit
     */
    public List<ENTITY> getList();

    /**
     * 検索結果の総件数取得
     * @return 件数
     */
    public Integer getCount();

    /**
     * 検索条件取得
     * @return 検索条件
     */
    public CONDITION getCondition();

}
