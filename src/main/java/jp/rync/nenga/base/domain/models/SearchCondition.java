package jp.rync.nenga.base.domain.models;

import java.util.Optional;

public interface SearchCondition {

    /**
     * Limitの取得
     *
     * @return Limit
     */
    public Optional<Integer> getLimit();

    /**
     * Offsetの取得
     *
     * @return Offset
     */
    public Optional<Integer> getOffset();
}
