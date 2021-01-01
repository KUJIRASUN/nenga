package jp.rync.nenga.base.domain.models;

import jp.rync.nenga.UnitTestInterface;
import org.junit.jupiter.api.Test;

interface EntityUnitTest<T, ID extends Identifier<T>, ENTITY extends Entity<ID>> extends UnitTestInterface<ENTITY> {
    /**
     * テスト用インスタンスの生成（ID定義なし）
     * @return テスト用インスタンス
     */
    ENTITY generateTestInstanceForIdNotFound();

    @Test
    void getIdTest();

    @Test
    void getIdWithIdNotFoundExceptionTest();
}