package jp.rync.nenga.base.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public interface EntityWithLongUnitTest<ID extends Identifier<Long>, ENTITY extends Entity<ID>> extends EntityUnitTest<Long, ID, ENTITY>{
    @Test
    @Override
    default void getIdTest() {
        Long expected = 1L;
        try {
            Long actual = generateTestInstance().getId().getValue();
            assertEqualsWithLogger(expected, actual);
        } catch (IdNotFoundException infe) {
            logger.debug("Test failure", infe);
            fail("Test failure: id not found exception.", infe);
        }

    }

    @Test
    @Override
    default void getIdWithIdNotFoundExceptionTest() {
        ENTITY actual = generateTestInstanceForIdNotFound();
        assertThrows(IdNotFoundException.class, actual::getId);
    }
}
