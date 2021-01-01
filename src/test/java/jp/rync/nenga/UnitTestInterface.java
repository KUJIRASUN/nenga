package jp.rync.nenga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 単体テストコード用のインターフェース
 * @param <T> 生成するインスタンスの型
 */
public interface UnitTestInterface<T> {
    /**
     * テスト用インスタンスの生成
     * @return テスト用インスタンス
     */
    T generateTestInstance();

    /**
     * Logger
     */
    Logger logger = LoggerFactory.getLogger(UnitTestInterface.class);

    /**
     * assertEqualsメソッドのラッパーで、期待値と実値のログを出力してassertをかける
     * @param expected 期待値
     * @param actual 実値
     */
    default <V> void assertEqualsWithLogger(V expected, V actual) {
        logger.debug(String.format("Expected: %s", expected));
        logger.debug(String.format("Actual: %s", actual));
        assertEquals(expected, actual);
    }
}
